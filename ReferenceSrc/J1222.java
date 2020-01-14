import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("all")
public class J1222 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int N = cin.nextInt();
            int boo = cin.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = cin.nextInt();
            }
            Arrays.sort(arr);
            if (boo == 0) {
                for (int i : arr) {
                    System.out.println(i);
                }
            } else {
                for (int i = N - 1; i >= 0; i--) {
                    System.out.println(arr[i]);
                }
            }
        }
        cin.close();
    }
}
