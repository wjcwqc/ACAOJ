import java.util.Scanner;

public class Problem_1270 {
    public static void main(String[] args) {
        int nothing = cin.nextInt();
        int n = cin.nextInt();
        int[] y = new int[n];
        int[] m = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            y[i] = cin.nextInt();
            m[i] = cin.nextInt();
            d[i] = cin.nextInt();
            if (m[i] < d[i]) {
                int t = m[i];
                m[i] = d[i];
                d[i] = t;
            }
        }
        int[] f = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int a = 0;
            for (int x = 1; x < n; x++) {
                if (cp(y, m, d, a, x) > 0) {
                    a = x;
                }
            }
            f[cnt++] = a;
        }
        for (int i = 0; i < n; i++) {
            if (i == 0 || cp(y, m, d, i - 1, i) < 0) {
                System.out.println(y[i] + " " + m[i] + " " + d[i]);
            }
        }
    }

    static Scanner cin = new Scanner(System.in);

    //大于0交换，小于0
    public static int cp(int[] y, int[] m, int[] d, int a, int x) {
        int rst = 0;
        if (a == x) {
        } else if (y[a] > y[x]) {
            rst = 1;
        } else if (y[a] == y[x]) {
            if (m[a] > m[x]) {
                rst = 1;
            } else if (m[a] == m[x]) {
                if (d[a] > d[x]) {
                    rst = 1;
                } else if (d[a] == d[x]) {
                } else {
                    rst = -1;
                }
            } else {
                rst = -1;
            }
        } else {
            rst = -1;
        }
        return rst;
    }
}
