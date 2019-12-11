import java.util.Scanner;

public class J1150 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String M = cin.next();
            int N = cin.nextInt();
            remainder(M, N);//余数
        }
        cin.close();
    }

    private static void remainder(String str, int N) {
        char[] arr = str.toCharArray();
        int ans = (arr[0] - '0') % N;
        for (int i = 1; i < arr.length; i++)
            ans = (ans * 10 + arr[i] - '0') % N;
        System.out.println(ans);
    }
}
