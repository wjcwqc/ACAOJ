import java.util.Scanner;

public class Problem_1074 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int[] arr = new int[6];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = cin.nextInt();
            }
            int sum1 = arr[2] + arr[5], sum2 = arr[1] + arr[4], sum3 = arr[0] + arr[3];
            if (sum1 > 59) {
                sum2 += sum1 / 60;
                sum1 = sum1 % 60;
            }
            if (sum2 > 59) {
                sum3 += sum2 / 60;
                sum2 = sum2 % 60;
            }
            System.out.println(sum3 + " " + sum2 + " " + sum1);
        }
    }
}
