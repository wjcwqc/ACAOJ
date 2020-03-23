import java.util.Scanner;

public class J2278 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        System.out.println(Fibonacci(N));
        cin.close();
    }

    private static int Fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
