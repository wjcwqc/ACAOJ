import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author MWD
 * @date 2020年6月30日 0030 14:47
 */
public class J3187b {
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
//            System.err.println("s:"+s);
//            System.err.println("x:"+x);
//            System.err.println("y:"+y);
//            System.err.println("count:"+count);
            System.out.println(y);

        }

        static Scanner cin = new Scanner(System.in);
}

