import java.util.Scanner;

public class Problem_1125 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()) {
            int n = cin.nextInt();
            int[][] yh = new int[n][n];
            for (int i = 0; i < n; i++) {
                yh[i][0] = 1;
            }
            for (int i = 1; i < n; i++) {
                for (int m = 1; m <= i; m++) {
                    yh[i][m] = yh[i - 1][m] + yh[i - 1][m - 1];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int m = 0; m <= i; m++) {
                    System.out.printf("%d ", yh[i][m]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
