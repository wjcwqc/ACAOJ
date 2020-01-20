import java.util.*;

public class J1432 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            int[] r = new int[n + 1];
            ArrayList[] g = new ArrayList[n + 1];
            for (int i = 0; i <= n; i++) {
                g[i] = new ArrayList();
            }
            for (int i = 0; i < m; i++) {
                int x = cin.nextInt();
                int y = cin.nextInt();
                g[x].add(y);
                r[y]++;
            }
            int[] ans = new int[n];
            boolean[] b = new boolean[n + 1];
            for (int i = 0; i < n; i++) {
                for (int j = n; j > 0; j--) {
                    if (r[j] == 0 & !b[j]) {
                        ans[i] = j;
                        b[j] = true;
                        for (int k = 0; k < g[j].size(); k++) {
                            r[(int) g[j].get(k)]--;
                        }
                        break;
                    }
                }
                if (ans[i] == 0) break;
            }
            if (ans[n - 1] == 0) System.out.println(-1);
            else {
                for (int i = 0; i < n - 1; i++) {
                    System.out.print(ans[i] + " ");
                }
                System.out.println(ans[n - 1]);
            }
        }
        cin.close();
    }
}
