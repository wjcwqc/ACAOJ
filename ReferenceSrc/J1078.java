import java.util.Scanner;

public class J1078 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int x = cin.nextInt();
            if (x == 0) break;
            System.out.println(odd(x));
        }
        cin.close();
    }

    private static int odd(int N) {
        return N == 1 ? 0 : 1 + odd(N % 3 == 0 ? N / 3 : N / 3 + 1);
    }
}