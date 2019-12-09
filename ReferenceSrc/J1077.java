import java.util.Scanner;

public class J1077 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[][] arr = new int[10][10];
        while (cin.hasNext()) {
            int N = cin.nextInt();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j <= i; j++) {
                    if (i == j || j == 0) arr[i][j] = 1;
                    else arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < N - i; j++) {
                    System.out.print(String.format("%d", arr[N - i - 1][j]));
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        cin.close();
    }
}
