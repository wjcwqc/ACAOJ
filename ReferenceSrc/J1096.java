import java.util.Scanner;

public class J1096 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String A = cin.nextLine();
        String B = cin.nextLine();
        int num = minDistance(A,B);
        System.out.println(num);

    }

    public static int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        // 第一行
        for (int j = 1; j <= n2; j++) dp[0][j] = dp[0][j - 1] + 1;
        // 第一列
        for (int i = 1; i <= n1; i++) dp[i][0] = dp[i - 1][0] + 1;

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1];
                else dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]), dp[i - 1][j]) + 1;
            }
        }
        return dp[n1][n2];
    }
}
//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        String A = cin.nextLine();
//        String B = cin.nextLine();
//        char[] arr=A.toCharArray();
//        char[] rst=B.toCharArray();
//        char[] list=new char[rst.length];
//        char[] pos=new char[rst.length]
//        //locate position
//        int cnt=0;
//        for(int i=0;i<arr.length;i++){
//            for(int n=0;n<rst.length;n++){
//                if(arr[i]==rst[n]){
//                    list[n]=rst[n];
//                    pos[cnt]=rst[n];
//                    cnt++;
//                }
//            }
//        }
//        //check position
//        int l=0;
//        for(int i=0;i<rst.length;i++){
//            for(int n=l;n<)
//        }
//        //finish
//    }

