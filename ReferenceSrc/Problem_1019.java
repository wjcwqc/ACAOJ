import java.util.Arrays;
import java.util.Scanner;

public class Problem_1019 {
    private static final int N = 4;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        Arrays.sort(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
        cin.close();
    }
}
