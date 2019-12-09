import java.util.Scanner;

public class J1057 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        int y = cin.nextInt();
        sum(x, y);
    }

    private static void sum(int m, int n) {
        long tot = 0;
        for (int i = m; i <= n; i++) {
            if ((i - 1) % 3 == 0 && (i - 3) % 5 == 0) tot += i;
        }
        System.out.println(tot);
    }
}
