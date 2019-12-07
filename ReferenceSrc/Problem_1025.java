import java.math.BigDecimal;
import java.util.Scanner;

public class Problem_1025 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        double sum = 0;
        for (double i = 1; i < 10000000; i++) {
            sum += 1 / (i * i);
        }
        double pi = Math.sqrt(6 * sum);
        BigDecimal fmt = new BigDecimal("" + pi);
        System.out.println(fmt.setScale(N, BigDecimal.ROUND_HALF_DOWN));
    }
}