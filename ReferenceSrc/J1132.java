import java.util.Arrays;
import java.util.Scanner;

public class J1132 {
    private static final int N = 7;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double[] arr = new double[N];
        while (cin.hasNext()) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = cin.nextDouble();
            }
            String s = cin.next();
            Arrays.sort(arr);
            double temp = 0;
            for (int i = 1; i < arr.length - 1; i++) {
                temp += arr[i];
            }
            double sum = temp / 5.0;
            System.out.print(s + " ");
            System.out.printf("%.2f", sum);
            System.out.println();
        }
        cin.close();
    }
}
