import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class J2580 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        Deque<Integer> queue = new LinkedList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!queue.isEmpty()) {
                int t = queue.getLast();
                queue.pollLast();
                queue.addFirst(t);
            }
            queue.addFirst(arr[i]);
        }
        System.out.println(N);
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
    }
}
