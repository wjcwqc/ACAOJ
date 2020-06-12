/**
 * @author MWD
 * @date 2020年6月12日 0012 22:08
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class J2086 {
    static int du[], n, L[];
    static Vector<Integer> g[];


    private static boolean toposort() {
        du = new int[n];
        L = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < g[i].size(); j++) {
                du[g[i].get(j)]++;
            }
        }
        int tot = 0;
        Queue<Integer> Q = new LinkedList<>();

        for (int i = n - 1; i >= 0; i--)//产生字典序最大的拓扑排序,如果是要字典序最小则循环改为for(i=0;i<n;i++)即可

        {
            if (du[i] == 0)
                Q.add(i);
        }

        while (!Q.isEmpty()) {
            int x = Q.poll();
            L[tot++] = x;
            for (int i = 0; i < g[x].size(); i++) {
                int t = g[x].get(i);
                du[t]--;
                if (du[t] == 0)
                    Q.add(t);
            }
        }

        if (tot == n)
            return true;
        return false;
    }


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        while (cin.hasNext()) {
            n = cin.nextInt();
            g = new Vector[n];
            for (int i = 0; i < n; i++) {
                g[i] = new Vector<>();
            }
            for (int x = 0; x < n; x++) {
                for (int y = 0; y < n; y++) {
                    if (cin.nextInt() > 0) {
                        g[x].addElement(y);
                    }
                }

            }
            if (toposort()) {
                for (int i = 0; i < n - 1; i++) {
                    System.out.print(L[i] + " ");
                }
                System.out.println(L[n - 1]);
            } else {
                System.out.println("ERROR");
            }
        }
        cin.close();
    }
}
