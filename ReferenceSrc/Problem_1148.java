import java.util.Scanner;

public class Problem_1148 {

    public static void main(String[] args) {
        int n = cin.nextInt();
        int m = cin.nextInt();
        String[][] arr = new String[30][n];
        int cnt = 0;
        while (cin.hasNext()) {
            for (int i = 0; i < n; i++) {
                arr[cnt][i] = cin.next();
            }
            cnt++;
        }
    }

    static Scanner cin = new Scanner(System.in);
}
