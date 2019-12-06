import java.util.Arrays;
import java.util.Scanner;


public class Problem_1004 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) continue;
                for (int k = 0; k < arr.length; k++) {
                    if (i == k || j == k) continue;
                    for (int l = 0; l < arr.length; l++) {
                        if (i == l || j == l || k == l) continue;
                        System.out.println(arr[j] + " " + arr[k] + " " + arr[l]);
                    }
                }
            }
        }
        cin.close();
    }
}