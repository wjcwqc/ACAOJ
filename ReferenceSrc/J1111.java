import java.util.Scanner;

import static java.lang.Math.pow;

public class J1111 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] arr = new int[10];
        int len = 0;
        int k = cin.nextInt(), n = cin.nextInt();
        while (n != 0) {
            arr[len++] = n % 2;
            n /= 2;
        }
        long sum = 0;
        for (int i = 0; i < len; i++) {
            sum += (long) arr[i] * pow(k, i);
        }
        System.out.println(sum);
        cin.close();
    }
}
