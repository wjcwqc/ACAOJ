import java.util.Arrays;
import java.util.Scanner;

/**
 * @author MWD
 * @date 2020年6月30日 0030 14:32
 */
public class J3192b {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int[] arr = new int[N];
        int[] arr2 = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = cin.nextInt();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i+1; j++) {
                arr2[i] += arr[j];
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ",arr2[i]);
        }
//        System.out.println(Arrays.toString(arr2));
    }
}
