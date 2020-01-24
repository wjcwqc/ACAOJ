import java.util.Arrays;
import java.util.Scanner;

public class J1454 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        int N = cin.nextInt();
        String[] a = new String[N];
        for (int i = 0; i < N; i++) {
            a[i] = cin.next();
        }
        int[] b = new int[N];
        Arrays.fill(b, 0);
        String[] arr = str.toLowerCase().split("[^A-Za-z]");
        for (String x : arr) {
            for (int i = 0; i < a.length; i++)
                if (a[i].equals(x)) ++b[i];
        }
        for (int z : b) {
            System.out.println(z);
        }
    }
}
