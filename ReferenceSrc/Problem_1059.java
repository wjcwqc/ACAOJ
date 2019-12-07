import java.util.Scanner;

public class Problem_1059 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        double an_0 = cin.nextDouble();
        double an_1 = cin.nextDouble();
        double tot = 0.0;
        for (int i = 1; i <= N; i++) {
            double cn = cin.nextDouble();
            tot += 2.0 * (N + 1 - i) * cn;
        }
        double ans = N * an_0 + an_1 - tot;
        System.out.println(String.format("%.2f", ans / (N + 1)));
    }
}
