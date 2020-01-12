import java.util.Scanner;

@SuppressWarnings("all")
public class J1181 {
    private static int[] Fn = new int[21];

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            System.out.println(Fibonacci(cin.nextInt()));
        }
        cin.close();
    }

    private static int Fibonacci(int N) {
        if (Fn[N] != 0) return Fn[N];
        if (N == 1) return Fn[N] = 1;
        if (N == 2) return Fn[N] = 1;
        return Fn[N] = Fibonacci(N - 1) + Fibonacci(N - 2);
    }
}
