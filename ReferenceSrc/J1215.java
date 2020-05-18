import java.util.Scanner;

public class J1215 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int[] A = new int[n + 1];
            int b = 0;
            for (int i = 0; i < n; i++) {
                A[i] = cin.nextInt();
                b = cin.nextInt();
            }
            A[n] = b;
            int[][] m = new int[n][n];
            Compute(A, m);
        }
        cin.close();
    }

    public static void Compute(int[] a, int[][] m) {
        int t = 0;
        int min = 0;
        int temp = 0;
        for (int i = 2; i < a.length; i++) {
            for (int j = 0; j < a.length - i; j++) {
                t = j + i - 1;
                m[j][t] = Integer.MAX_VALUE;
                for (int k = j; k < t; k++) {
                    temp = m[j][k] + m[k + 1][t] + a[j] * a[k + 1] * a[t + 1];
                    if (temp < m[j][t]) {
                        min = temp;
                        m[j][t] = temp;
                    }
                }
            }
        }
        System.out.println(min);
    }
}