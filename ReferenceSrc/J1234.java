import java.util.Scanner;

public class J1234 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()) {
            int n = cn.nextInt();
            int m = cn.nextInt();
            System.out.print('+');
            for (int i = 0; i < n; i++) {
                System.out.print('-');
            }
            System.out.println('+');
            for (int i = 0; i < m; i++) {
                System.out.print('|');
                for (int j = 0; j < n; j++) {
                    System.out.print(' ');
                }
                System.out.println('|');
            }
            System.out.print('+');
            for (int i = 0; i < n; i++) {
                System.out.print('-');
            }
            System.out.println('+');
        }
        cn.close();
    }
}