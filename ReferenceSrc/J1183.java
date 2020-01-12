import java.util.Scanner;

@SuppressWarnings("all")
public class J1183 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int i = cin.nextInt(), j = cin.nextInt();
            if (i != 0 && j != 0) {
                int N = gcd(i, j);
                int M = i * j / N;
                System.out.println(N + " " + M);
            } else if (i == 0) {
                System.out.println(j + " " + 0);
            } else {
                System.out.println(i + " " + 0);
            }
        }
        cin.close();
    }

    private static int gcd(int N, int T) {
        int m, n, r;
        if (N > T) {
            m = N;
            n = T;
        } else {
            m = T;
            n = N;
        }
        r = m % n;
        while (r != 0) {
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }
}
