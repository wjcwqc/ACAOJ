import java.util.Scanner;

public class J1266 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()) {
            boolean flag = false;
            int[] a = new int[3];
            for (int i = 0; i < 3; i++) {
                a[i] = cn.nextInt();
            }
            if (a[0] == -1 && a[1] == -1 && a[2] == -1)
                return;
            for (int i = 0; i < 3; i++) {
                if (a[i] <= 168) {
                    System.out.println("CRASH " + a[i]);
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println("NO CRASH");
        }
    }
}