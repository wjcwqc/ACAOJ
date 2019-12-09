import java.util.Arrays;
import java.util.Scanner;

public class J1075 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        Arrays.sort(arr);
        int count = 1, longest = 0, most = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) ++count;
            else {
                count = 1;
                continue;
            }
            if (count > longest) {
                most = arr[i];
                longest = count;
            }
        }
        System.out.println(most);
        System.out.println(longest);
        cin.close();
    }
}
