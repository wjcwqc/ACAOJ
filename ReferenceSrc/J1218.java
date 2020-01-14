import java.util.Scanner;

public class J1218 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = cn.nextInt();
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            int min = a[0][i];
            for (int j = 0; j < n; j++) {
                if (min > a[j][i])
                    min = a[j][i];
            }
            result += min;
        }
        System.out.println(result);
    }
}