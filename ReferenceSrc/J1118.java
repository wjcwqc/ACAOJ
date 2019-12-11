import java.util.Scanner;

public class J1118 {
    private static final int MOD = 7654321;
    private static int[] arr = new int[10000];

    static {
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 10000; i++) {
            arr[i] = (arr[i - 1] % MOD + arr[i - 2] % MOD) % MOD;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        System.out.println(arr[N - 1]);
        cin.close();
    }
}
