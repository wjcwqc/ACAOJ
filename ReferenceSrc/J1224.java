import java.util.Scanner;

public class J1224 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()) {
            int n = cn.nextInt();
            int t = cn.nextInt();
            int[][] aa = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    aa[i][j] = cn.nextInt();
                }
            }
            if (t == 1)
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(aa[0][j]);
                    for (int i = 1; i < n; i++) {
                        System.out.print(" " + aa[i][j]);
                    }
                    System.out.println();
                }
            else if (t == 2)
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(aa[i][n - 1]);
                    for (int j = n - 2; j >= 0; j--) {
                        System.out.print(" " + aa[i][j]);
                    }
                    System.out.println();
                }
            else if (t == 3)
                for (int j = 0; j < n; j++) {
                    System.out.print(aa[n - 1][j]);
                    for (int i = n - 2; i >= 0; i--) {
                        System.out.print(" " + aa[i][j]);
                    }
                    System.out.println();
                }
        }
    }
}