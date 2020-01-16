import java.util.Scanner;

public class J1318 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        while (N-- > 0) {
            int m = cin.nextInt();
            int n = cin.nextInt();
            System.out.println(fun(m, n));
        }
    }

    private static int fun(int m, int n) {
        int sum = 0;
        for (int i = 1; i <= m; i++) {
            sum += i % n;
        }
        return sum;
    }
}
