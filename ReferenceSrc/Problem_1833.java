import java.util.Scanner;

public class Problem_1833 {
    public static void main(String[] args) {
        int n = cin.nextInt();
        int s = 1, x = 0, y = 0;
        for (int i = 2; i <= n; i++) {
            int m = i;
            while (m % 2 == 0) {
                m /= 2;
                ++x;
            }
            while (m % 5 == 0) {
                m /= 5;
                ++y;
            }
            s = s * m % 10;
        }
        for (int i = 0; i < x - y; i++) {
            s = (s * 2) % 10;
        }
        System.out.println(s);

    }

    static Scanner cin = new Scanner(System.in);
}
