import java.util.Arrays;
import java.util.Scanner;

public class J1739 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = cin.next();
        }
        Arrays.sort(arr, (o1, o2) -> {
            int d1 = Integer.valueOf(o1.substring(6, 14));
            int d2 = Integer.valueOf(o2.substring(6, 14));
            return d2 - d1;
        });
        for (String s : arr) {
            System.out.println(s);
        }
        cin.close();
    }
}
