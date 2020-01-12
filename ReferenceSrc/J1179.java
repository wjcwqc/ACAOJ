import java.util.Scanner;

public class J1179 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        while (n-- > 0) {
            double a = cn.nextInt();
            double b = cn.nextInt();
            double c = cn.nextInt();
            if (a + b == c)
                System.out.println((int) a + "+" + (int) b + "=" + (int) c);
            else if (a - b == c)
                System.out.println((int) a + "-" + (int) b + "=" + (int) c);
            else if (a * b == c)
                System.out.println((int) a + "x" + (int) b + "=" + (int) c);
            else if (a / b == c)
                System.out.println((int) a + "/" + (int) b + "=" + (int) c);
            else if (b - a == c)
                System.out.println((int) b + "-" + (int) a + "=" + (int) c);
            else if (b / a == c)
                System.out.println((int) b + "/" + (int) a + "=" + (int) c);
            else
                System.out.println("None");

        }
    }
}