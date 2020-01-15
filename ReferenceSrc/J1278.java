import java.util.Scanner;

public class J1278 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        /*Math.toRadians将弧度转化为角度*/
        System.out.printf("%.3f %.3f", Math.sin(Math.toRadians(n)),
                Math.cos(Math.toRadians(n)));
    }
}