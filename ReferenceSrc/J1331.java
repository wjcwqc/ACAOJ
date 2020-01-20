import java.util.Scanner;

public class J1331 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int t = cn.nextInt();
        while (t-- > 0) {
            int m = cn.nextInt();
            int n = cn.nextInt();
            int[][] a = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = cn.nextInt();
                }
            }
            boolean flag = true;
            for (int i = 1; i < m - 1; i++) {
                for (int j = 1; j < n - 1; j++) {
                    if (a[i][j] > a[i][j + 1] && a[i][j] > a[i][j - 1]
                            && a[i][j] > a[i + 1][j] && a[i][j] > a[i - 1][j]) {
                        System.out.println(a[i][j] + " " + (i + 1) + " "
                                + (j + 1));
                        flag = false;
                    }
                }
            }
            if (flag) {
                System.out.println("None " + m + " " + n);
            }
        }
    }
}