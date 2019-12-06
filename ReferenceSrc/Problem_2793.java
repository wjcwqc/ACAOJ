import java.util.PriorityQueue;
import java.util.Scanner;

@SuppressWarnings("all")
public class Problem_2793 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        PriorityQueue<Integer> Q = new PriorityQueue<>();
        while (N-- > 0) {
            Q.add(cin.nextInt());
        }
        int tot = 0;
        while (Q.size() > 1) {
            int y = Q.peek();
            Q.poll();
            int x = Q.peek();
            Q.poll();
            tot += x + y;
            Q.offer(x + y);
        }
        System.out.println(tot);
        cin.close();
    }
}
