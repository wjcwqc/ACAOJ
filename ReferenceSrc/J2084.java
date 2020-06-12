/**
 * @author MWD
 * @date 2020年6月12日 0012 22:07
 */
import java.util.*;

class J2084 {
    private static void Kruskal(List<Edge> list, int[][] g) {
        //贪心算法+并查集
        int[] set = new int[g.length];
        for (int i = 0; i < g.length; i++) {
            set[i] = i;
        }
        int tot = 0;
        for (Edge e : list) {
            int s1 = find(set, e.u);
            int s2 = find(set, e.v);
            if (s1 != s2) {
                tot += g[e.u][e.v];
                union(set, s1, s2);
            }
        }
        System.out.println(tot);
    }

    public static void main(String[] args) {
        int INF = Integer.MAX_VALUE;
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[][] g = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j] = cin.nextInt();
                if (i != j && g[i][j] == 0) {
                    g[i][j] = INF;
                }
            }
        }
        ArrayList<Edge> list = new ArrayList<>();
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g.length; j++) {
                if (g[i][j] != 0 && g[i][j] != INF) {
                    list.add(new Edge(i, j, g[i][j]));
                }
                ;
            }
        }
        Collections.sort(list, new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.w - o2.w;
            }
        });
        //        for (Edge e : list) {
        //            System.out.println(e.u+" "+e.v+" "+e.w);
        //        }
        Kruskal(list, g);
    }

    private static void union(int[] f, int a, int b) {
        int x = find(f, a);
        int y = find(f, b);
        if (x != y) {
            f[x] = y;
        }
    }

    private static int find(int[] f, int a) {
        return a == f[a] ? a : (f[a] = find(f, f[a]));
    }

    static class Edge {
        int u, v, w;

        Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }
}