import java.util.Scanner;

public class J1249 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()) {
            int a = cn.nextInt();
            int b = cn.nextInt();
            if (a == 0 && b == 0)
                return;
            int x = 1;
            for (int i = 0; i < b; i++) {
                x = (a * x) % 1000;
            }
            System.out.println(x);
        }
    }
}