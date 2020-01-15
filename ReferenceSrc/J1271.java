import java.util.Scanner;

public class J1271 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        double r = cn.nextDouble();
        double h = cn.nextDouble();
        double s = Math.PI*Math.pow(r, 2)*2+Math.PI*r*2*h;
        System.out.println(String.format("Area=%.3f",s));
    }
}