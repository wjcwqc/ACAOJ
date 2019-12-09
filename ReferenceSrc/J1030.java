import java.util.Scanner;

public class J1030 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
        cin.close();
    }

    private static boolean isPrime(int N) {
        if (N == 2) return true;
        if (N <= 1 || N % 2 == 0) return false;
        for (int i = 3; i * i <= N; i += 2)
            if (N % i == 0) return false;
        return true;
    }
}