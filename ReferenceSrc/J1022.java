import java.io.PrintWriter;
import java.util.Scanner;

public class J1022 {
    private static Scanner cin = new Scanner(System.in);
    private static PrintWriter count = new PrintWriter(System.out);
    private static boolean isFirst = true;

    public static void main(String[] args) {
        int N = cin.nextInt();
        for (int i = 1; i <= N; i++) {
            if (isFirst) isFirst = false;
            else count.print(" ");
            count.print(fun(i));
        }
        cin.close();
        count.close();
    }

    private static int fun(int n) {
        if (n < 3) return 1;
        else return fun(n - 1) + fun(n - 2);
    }
}