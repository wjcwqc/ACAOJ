import java.util.Scanner;

public class J1440 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int N = cin.nextInt();
            if (N == 2 || N == 1) System.out.println(N);
            if (N >= 3) {
                if (N % 2 == 0) {
                    int i = N - 2;
                    while (gcd(N, i) > 1) {
                        i = i - 1;
                        if (i == 2) break;
                    }
                    long x1 = N;
                    long x2 = N - 1;
                    x1 = x1 * x2 * i;
                    x2 = x2 * (N - 2) * (N - 3);
                    if (x1 - x2 > 0) System.out.println(x1);
                    else System.out.println(x2);
                } else {
                    long y = N;
                    y = y * (N - 1) * (N - 2);
                    System.out.println(y);
                }
            }
        }
        cin.close();
    }

    private static int gcd(int N, int T) {
        int r;
        r = N % T;
        while (r != 0) {
            N = T;
            T = r;
            r = N % T;
        }
        return T;
    }
}
