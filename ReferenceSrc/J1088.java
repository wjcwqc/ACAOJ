import java.util.Scanner;

public class J1088 {
    private static final int[] arr = {100, 50, 20, 10, 5, 2, 1};
    private static Scanner cin = new Scanner(System.in);
    private static int tot = 0;

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int N = cin.nextInt();
            if (N == 0) break;
            for (int i = 0; i < N; i++) {
                tot += money(cin.nextInt());
            }
            System.out.println(tot);
        }
    }

    private static int money(int N) {
        int temp = 0;
        for (Integer x : arr) {
            temp += N / x;
            N %= x;
        }
        return temp;
    }
}
