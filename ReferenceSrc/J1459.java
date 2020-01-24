import java.util.Scanner;

public class J1459 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            int N = (4 * n - m) / 2;
            int M = (m - 2 * n) / 2;
            System.out.println(String.format("%d %d", M, N));
        }
    }
}
