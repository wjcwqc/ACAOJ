import java.util.Scanner;

public class Problem_1323 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        String[] str = new String[n];
        int[] y = new int[n];
        int[] m = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            str[i] = cin.next();
            y[i] = cin.nextInt();
            m[i] = cin.nextInt();
            d[i] = cin.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y[i] = 10000 * y[i] + 100 * m[i] + d[i];
        }
        int[] all = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            for (int x = 0; x < n; x++) {
                if (y[x] > m[i]) {
                    m[i] = y[x];
                    d[i] = x;
                }
            }
            all[i] = d[i];
            y[d[i]] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(str[all[i]]);
        }
    }
}
