import java.util.Scanner;

public class J1170 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();
        int t = m + n;
        int[][] at = new int[t][2];
        for (int i = 0; i < t; i++) {
            at[i][0] = cin.nextInt();
            at[i][1] = cin.nextInt();
        }
        int max = 0;
        for (int i = 0; i < t; i++) {
            if (max < at[i][1]) max = at[i][1];
        }
        int[] all = new int[max + 1];
        for (int i = 0; i < t; i++) {
            all[at[i][1]] += at[i][0];
        }
        for (int i = max; i >= 0; i--) {
            if (all[i] != 0) {
                System.out.println(all[i] + " " + i);
            }
        }
//        for(int i=0;i<t;i++){
//            for(int x=0;x<m+n-t;x++){
//                if(am[i][1]==an[x][1]){
//                    at[i][0]=am[i][0]+an[x][0];
//                    at[i][1]=am[i][1];
//                }
//            }
//        }
//        for(int i=0;i<t;i++){
//            for(int x =0;x<m;x++){
//                if(am[x][1]>an[i][1]){
//                    an[i][0]=am[x][0];
//                    an[i][1]=am[x][1];
//                }
//            }
//        }
//        for (int i=0;i<m;i++){
//            System.out.println(an[i][0]+" "+an[i][1]);
//        }

    }
}
