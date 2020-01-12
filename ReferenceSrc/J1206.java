import java.util.Scanner;

@SuppressWarnings("all")
public class J1206 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        while (N-- > 0) {
            int n = cin.nextInt();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                int M = cin.nextInt();
                if (isPrime(M))
                    sum += M;
            }
            System.out.println(sum);
        }
    }

    private static boolean isPrime(int N) {
        if (N == 2) return true;
        if (N % 2 == 0 || N < 2) return false;
        for (int i = 3; i * i <= N; i += 2) {
            if (N % i == 0) return false;
        }
        return true;
    }
}
