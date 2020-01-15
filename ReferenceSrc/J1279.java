import java.util.Scanner;

public class J1279 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int x1 = cn.nextInt();
        int y1 = cn.nextInt();
        int x2 = cn.nextInt();
        int y2 = cn.nextInt();
        double s = Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2,2));
        System.out.printf("%.3f",s);
    }
}