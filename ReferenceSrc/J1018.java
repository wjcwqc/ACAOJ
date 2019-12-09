import java.util.Scanner;

public class J1018 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        if (N <= 0) return;
        int m = N * N - N + 1;
        System.out.print(String.format("%d*%d*%d=%d=%d", N, N, N, N * N * N, m));
        for (int i = 1; i < N; i++) {
            m += 2;
            System.out.print(String.format("+%d", m));
        }
    }
}