import java.util.Scanner;

/**
 * @author MWD
 * @date 2020年5月18日 0018 16:56
 */
public class J2600 {
    private static final int NUM = 1000000007;
    private static int[] Fn = new int[1001];

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        if (N > 1000 || N < 1) {
            return;
        }
        System.out.println(function(N));
        cin.close();
    }

    private static int function(int n) {
        if (Fn[n] != 0) {
            return Fn[n];
        }
        if (n == 1) {
            return Fn[n] = 2;
        }
        if (n == 2) {
            return Fn[n] = 3;
        }
        return Fn[n] = (function(n - 1) + function(n - 2)) % NUM;
    }
}
