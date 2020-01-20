import java.util.Scanner;

import static java.lang.Math.max;

public class J1361 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int[][] dp = new int[N][N];
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = cin.nextInt();
            }
        }
        System.arraycopy(arr[N - 1], 0, dp[N - 1], 0, arr.length);
        for (int i = N - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = arr[i][j] + max(dp[i + 1][j], dp[i + 1][j + 1]);
            }
        }
        System.out.println(dp[0][0]);
        cin.close();
    }
}
