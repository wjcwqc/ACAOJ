/**
 * @author MWD
 * @date 2020年6月12日 0012 22:02
 */
import java.util.Scanner;

public class J1190 {
    static int[] F;

    static void init(int n) {
        F = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            F[i] = i;
        }
    }

    static boolean union(int x, int y) {
        int fx = find(x);
        int fy = find(y);
        if (fx == fy) {
            return false;
        }
        F[fx] = fy;
        return true;
    }

    static int find(int x) {
        return x == F[x] ? x : (F[x] = find(F[x]));
    }

    static int count() {
        int tot = 0;
        for (int i = 1; i < F.length; i++) {
            if (i == F[i]) ++tot;
        }
        return tot;
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            if (n == 0 && m == 0) break;
            init(n);

            while (m-- > 0) {
                int x = cin.nextInt();
                int y = cin.nextInt();
                union(x + 1, y + 1);
            }
            System.out.println(count() - 1);
        }
    }


    static Scanner cin = new Scanner(System.in);
}
