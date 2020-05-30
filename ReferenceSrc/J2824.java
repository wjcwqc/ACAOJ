/**
 * @author MWD
 * @date 2020年5月29日 0029 15:49
 */

import java.util.Scanner;

public class J2824 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        a = new int[n];
        v = new boolean[n];
        if (n % 2 == 0) {
            dfs(0);
        }
        if (!flag) {
            System.out.println("no solution");
        }
    }

    static int n;
    static int[] a;
    static boolean[] v;
    static boolean flag;

    private static void dfs(int k) {
        if (flag) {
            return;
        }
        if (k >= n) {
            if (primer(a[n - 1] + a[0])) {
                flag = true;
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
            }
            return;
        }
        for (int i = 0; i < n; i++) {
            if (v[i]) {
                continue;
            }
            if (k > 0 && !primer(a[k - 1] + i + 1)) {
                continue;
            }
            v[i] = true;
            a[k] = i + 1;
            dfs(k + 1);
            v[i] = false;
        }
    }

    private static boolean primer(int n) {
        if (n == 2) {
            return true;
        }
        if (n < 2 || n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
