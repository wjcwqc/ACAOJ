import java.util.Scanner;

public class J1152 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        if (N > 2000000 || N < 10) return;
        int A = 0;
        for (int i = N; i > 1; i--) {
            if ((2 * N % i == 0) && (A = (2 * N / i + 1 - i)) % 2 == 0 && A >> 1 > 0) {
                System.out.println(String.format("%d %d", A / 2, A / 2 + i - 1));
            }
        }
        cin.close();
    }
}
