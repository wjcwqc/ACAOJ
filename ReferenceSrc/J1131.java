import java.util.Scanner;

public class J1131 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int N = cin.nextInt();
            int M = cin.nextInt();
            combination(N, M);
        }
    }

    //组合数
    private static void combination(int N, int M) {
        if (N == M) {
            System.out.println("1");
            return;
        }
        long m = 1, n = 1;
        int x;
        if (N / 2.0 > M) x = M;
        else x = N - M;
        for (int i = 1; i <= x; i++, N--) {
            m = m * N;
            n = n * i;
        }
        System.out.println(m / n);
    }
}
