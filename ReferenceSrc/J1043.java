import java.util.Scanner;

public class J1043 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        double temp, sum = 1;
        for (double i = 2.0; i <= m; i++) {
            temp = 1 / (i * i);
            sum -= temp;
        }
        System.out.println(String.format("%.6f", sum));
    }
}
