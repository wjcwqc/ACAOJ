import java.util.Scanner;

public class J1439 {

    private static Scanner cin = new Scanner(System.in);
    private static final long[][] unit = {{1, 1}, {1, 0}};// 单位矩阵
    private static final long le9 = 1000000007;

    private static long mul(long a, long b) {// 快速乘法
        long ans = 0, tmp = a % le9;
        while (b != 0) {
            if ((b & 1) == 1) {
                if ((ans += tmp) >= le9) ans -= le9;
            }
            if ((tmp <<= 1) >= le9) tmp -= le9;
            b >>= 1;
        }
        return ans;
    }

    private static long mul_mod(long m, long n) {// 快速幂取模
        long ret = 1 % le9;
        while (n != 0) {
            if ((n & 1) == 1) ret = mul(ret, m);
            m = mul(m, m);
            n >>= 1;
        }
        return ret;
    }

    private static long[][] mul(long[][] a, long[][] b) {// 矩阵乘法
        long[][] arr = new long[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    arr[i][j] += a[i][k] * b[k][j] % (le9 - 1);
                }
            }
        }
        return arr;
    }

    private static long[][] mul_Power(long[][] arr, long n) {// 矩阵快速幂
        long[][] res = new long[arr.length][arr[0].length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                if (i == j) res[i][j] = 1;
                else res[i][j] = 0;
            }
        }
        while (n != 0) {
            if ((n & 1) == 1) res = mul(res, arr);
            n >>= 1;
            arr = mul(arr, arr);
        }
        return res;
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            int n = cin.nextInt();
            if (a * b == 0) {
                System.out.println("0");
                continue;
            }
            long num1 = mul_Power(unit, n - 1)[0][1];
            long num2 = mul_Power(unit, n)[0][1];
            System.out.println(mul_mod(a, num1) * mul_mod(b, num2) % le9);
        }
        cin.close();
    }
}
