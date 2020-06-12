/**
 * @author MWD
 * @date 2020年6月12日 0012 22:04
 */
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class J2601 {
    static class Edge implements Comparable<Edge> {
        int from, to, weight;

        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge that) {
            return this.weight - that.weight;
        }
    }

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
        if (fx == fy) return false;
        F[fx] = fy;
        return true;
    }

    static int find(int x) {
        return x == F[x] ? x : (x = find(F[x]));
    }

    public static void main(String[] args) {
        int n = cin.nextInt();
        int m = cin.nextInt();
        List<Integer> V = new Vector<Integer>();
        for (int i = 1; i <= n; i++) V.add(i);
        init(n);
        List<Edge> edges = new Vector<Edge>();
        for (int i = 0; i < m; i++) {
            int from = cin.nextInt();
            int to = cin.nextInt();
            int weight = cin.nextInt();
            edges.add(new Edge(from, to, weight));
            edges.add(new Edge(to, from, weight));
        }
        Collections.sort(edges);//贪心+并查集
        int tot = 0;
        for (Edge e : edges) {
            if (union(e.from, e.to))
                tot += e.weight;
        }
        System.out.println(tot);
    }

    static Scanner cin = new Scanner(System.in);
}
