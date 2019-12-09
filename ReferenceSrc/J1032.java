import java.io.PrintWriter;
import java.util.Scanner;

public class J1032 {
    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);

    public static void main(String[] args) {
        final int N = 100;
        for (int x = 0; x <= N / 5; x++)
            for (int y = 0; y <= N / 3; y++) {
                int z = N - x - y;
                if (z % 3 != 0) continue;
                if (5 * x + 3 * y + z / 3 == N) {
                    cout.println(String.format("cock=%d,hen=%d,chicken=%d", x, y, z));
                }
            }
        cin.close();
        cout.close();
    }
}