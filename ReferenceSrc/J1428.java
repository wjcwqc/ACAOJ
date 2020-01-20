import java.util.*;

public class J1428 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int N = cin.nextInt();
            Set<Integer> set = new TreeSet<>();
            for (int i = 0; i < N; i++) {
                int x = cin.nextInt();
                set.add(x);
            }
            List<Integer> list = new ArrayList<>(set);
            Collections.reverse(list);
            System.out.println(list.get(cin.nextInt() - 1));
        }
    }
}
