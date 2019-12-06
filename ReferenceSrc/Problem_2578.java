import java.math.BigInteger;
import java.util.Scanner;


public class Problem_2578 {


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        a[0] = 1;
        int k = 0;
        BigInteger sum = BigInteger.valueOf(1);
        for (int i = 1; i < n; i++)
            a[i] = a[i - 1] + 1;
        for (int i = 0; i < n; i++) {
            if (check(a[i])) {
                for (int j = a[i]; j <= n; j *= a[i])
                    b[k] += n / j;
            } else
                b[k] = 0;
            k++;
        }
        for (int x = 0; x < n; x++) {
            if (b[x] == 0) continue;
            else
                sum = sum.multiply(new BigInteger(String.valueOf((b[x] + 1))));
        }
        System.out.println(sum);
    }

    private static boolean check(int i) {
        boolean flag = true;
        if (i == 1) return !flag;
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
