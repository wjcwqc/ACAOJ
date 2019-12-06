import java.io.PrintWriter;
import java.util.Scanner;

public class Problem_1002 {
    private static Scanner cin = new Scanner(System.in);
    private static PrintWriter count = new PrintWriter(System.out);

    public static void main(String[] args) {
        double a = cin.nextDouble(), b = cin.nextDouble(), c = cin.nextDouble();
        if (a == 0 && b == 0) return;
        double root = b * b - 4 * a * c;
        if (root < 0) return;
        double root1 = Math.sqrt(root);
        double x1 = (-1 * b + root1) / (2 * a);
        double x2 = (-1 * b - root1) / (2 * a);
        count.println(String.format("%.2f", x1) + " " + String.format("%.2f", x2));
        cin.close();
        count.close();
    }
}