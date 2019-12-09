import java.util.Scanner;

public class J1042 {
    private static int[] Fn = new int[13];

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println(factorial(cin.nextInt()));
        cin.close();
    }

    //阶乘
    private static int factorial(int N) {
        if (Fn[N] != 0) return Fn[N];
        if (N == 0) return Fn[N] = 1;
        if (N == 1) return Fn[N] = 1;
        return Fn[N] = factorial(N - 1) * N;
    }
}