import java.util.Scanner;

public class J1320 {
    private static int[] Fn = new int[1001];

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int N = cin.nextInt();
            System.out.println(fun(N));
        }
    }

    private static int fun(int N) {
        if (Fn[N] != 0) return Fn[N];
        if (N == 0) return Fn[N] = 1;
        return Fn[N] = fun(N - 1) + 2 * N - 2;
    }
}
