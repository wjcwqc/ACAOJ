import java.util.Scanner;

public class J1311 {
    private static int N = 0;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int L = cin.nextInt();
        int R = cin.nextInt();
        for (int i = L; i <= R; i++) {
            if (Primer(i)) N++;
        }
        System.out.println(N);
    }

    private static boolean Primer(int N) {
        if (N == 2) return true;
        if (N <= 1 || N % 2 == 0) return false;
        for (int i = 3; i * i <= N; i += 2) {
            if (N % i == 0) return false;
        }
        return true;
    }
}
