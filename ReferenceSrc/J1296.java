import java.util.Scanner;

public class J1296 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()) {
            int n = cn.nextInt();
            double sum = 0;
            for (int i = 1,j = 0; i <= n; i+=2,j++) {
                if (j % 2 == 0)
                    sum += 1.0 / i;
                else
                    sum -= 1.0 / i;
            }
            System.out.printf("%.6f\n",sum*4);
        }
    }
}