import java.util.Scanner;

public class J1308 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        double sum = 0;
        double a = 1, b = 2;
        int i = 0;
        while (i < n) {
            sum += b / a;
            b = a + b;
            a = b - a;
            i++;
        }
        System.out.println(String.format("%.3f", sum));
        cn.close();
    }
}