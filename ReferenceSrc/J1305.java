import java.util.Arrays;
import java.util.Scanner;

public class J1305 {
    private static final int N = 10;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = cin.nextInt();
        }
        Arrays.sort(arr);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
