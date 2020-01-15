import java.util.Scanner;

public class J1287 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int tot = 0;
            while (n != 1) {
                if (n % 2 == 1) n = 3 * n + 1;
                else n /= 2;
                ++tot;
            }
            System.out.println(tot);
        }
        cin.close();
    }
}
