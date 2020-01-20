import java.util.Arrays;
import java.util.Scanner;

public class J1335 {
    static int[] arrays = new int[100000];

    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()) {
            Arrays.fill(arrays, 0);
            int n = cn.nextInt();
            System.out.println(halfSet(n));
        }
        cn.close();
    }

    private static int halfSet(int n) {
        if (arrays[n] > 0)
            return arrays[n];
        else {
            arrays[n] = 1;
            for (int i = 1; i <= n / 2; i++)
                arrays[n] += halfSet(i);
            return arrays[n];
        }
    }
}