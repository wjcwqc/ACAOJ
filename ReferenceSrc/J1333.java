import java.util.Scanner;

public class J1333 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()) {
            int n = cn.nextInt();
            int a = cn.nextInt();
            int[] t = new int[n];
            for (int i = 0; i < n; i++) {
                t[i] = cn.nextInt();
            }

            int count = 0;
            if (t[a - 1] > 0)
                count++;
            int i = a - 2, j = a;
            for (;; i--, j++) {
                if (i < 0 || j >= n)
                    break;
                if (t[i] + t[j] > 1) {
                    count += 2;
                }
            }
            while (i >= 0) {
                if (t[i] > 0)
                    count++;
                i--;
            }
            while (j < n) {
                if (t[j] > 0)
                    count++;
                j++;
            }
            System.out.println(count);
        }
    }
}