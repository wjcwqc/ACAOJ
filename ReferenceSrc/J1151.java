import java.util.*;

public class J1151 {
    private static List<Integer> Fn = new ArrayList<>();

    static {
        Fn.addAll(Arrays.asList(0, 1, 1));
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            System.out.println(F(cin.nextInt()));
        }
    }

    private static int F(int N) {
        int M = Fn.size();
        while (Fn.size() <= N) {
            long x = (long) Fn.get(M - 1) + Fn.get(M - 2) + Fn.get(M - 3);
            Fn.add((int) x);
        }
        return Fn.get(N);
    }
}
