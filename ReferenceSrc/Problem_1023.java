import java.util.*;

public class Problem_1023 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        while (cin.hasNext()) {
            int N = cin.nextInt();
            if (N == -1) break;
            list.add(N);
        }
        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));
        cin.close();
    }
}