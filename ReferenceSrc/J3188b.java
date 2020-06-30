import java.util.Arrays;
import java.util.Scanner;

/**
 * @author MWD
 * @date 2020年6月30日 0030 14:56
 */
public class J3188b {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = {0,0,0};
        int count = 0;
//        System.err.println(Arrays.toString(arr));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[j] += cin.nextInt();
            }

        }
        for (int j = 0; j < 3; j++) {
            count+=arr[j];
        }
        System.out.println(String.format("%d %d %d %d",arr[0],arr[1],arr[2],count));
    }
}
