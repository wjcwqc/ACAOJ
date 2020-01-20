import java.util.Scanner;

public class J1429 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int t = cn.nextInt();
        while (t-- > 0) {
            int n = cn.nextInt();
            int[][] a = new int[n][3];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i][0] = cn.nextInt();
                a[i][1] = cn.nextInt();
                a[i][2] = cn.nextInt();
                sum += a[i][2];
            }
            for (int i = 0; i < n - 1; i++) {
                for (int j = i; j < n; j++) {
                    if (a[i][0] - a[i][2] > a[j][0] - a[j][2]) {
                        int temp[] = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            int k = cn.nextInt();
            if (sum > k) {
                System.out.println("Oh,my god!");
            } else {
                int count = 0, ss = 0;
                for (int i = 0; i < n; i++) {
                    ss += a[i][0] - a[i][2];
                    if (ss <= k - sum)
                        count++;
                    else
                        break;
                }
                System.out.println(count);
            }
        }
    }
}