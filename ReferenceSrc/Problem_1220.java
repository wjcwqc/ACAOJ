import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Problem_1220 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] arr = new int[n];
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (Integer a : set) {
            System.out.println(a);
        }

    }
}
