import java.util.Scanner;

public class J1964 {
    private static int[] arr = {1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int N = cin.nextInt();
            f(N);
        }
    }

    private static void f(int N) {
        boolean is = false;
        for (int i = 8; i >= 0; i--) {
            if (N >= arr[i])
                N -= arr[i];
            if (N == 0) is = true;
        }
        if (is) System.out.println("Yes");
        else System.out.println("No");
    }
}
