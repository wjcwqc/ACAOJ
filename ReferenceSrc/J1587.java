/**
 * @author MWD
 * @date 2020年6月12日 0012 22:04
 */
import java.awt.*;
import java.util.*;
import java.util.Queue;

public class J1587 {
    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            int sx = cin.nextInt();
            int sy = cin.nextInt();
            Point start = new Point(sx, sy);
            HashSet<Point> points = new HashSet<>();
            HashMap<Point, Boolean> vis = new HashMap<>();
            for (int x = 1; x <= n; x++)
                for (int y = 1; y <= m; y++) {
                    if (cin.nextInt() == 0) continue;
                    if (x == sx && y == sy) continue;

                    Point pt = new Point(x, y);
                    points.add(pt);
                    vis.put(pt, false);
                }
            int tot = 0;
            Queue<Point> Q = new LinkedList<Point>();
            Q.offer(start);//flood
            vis.put(start, true);
            while (!Q.isEmpty()) {
                Point h = Q.poll();
                ++tot;
                for (int i = 0; i < 4; i++) {
                    Point np = new Point(h.x + next[i][0], h.y + next[i][1]);
                    if (points.contains(np) && !vis.get(np)) {
                        Q.offer(np);
                        vis.put(np, true);
                    }
                }
            }
            System.out.println(tot);
        }
    }

    static int[][] next = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    static Scanner cin = new Scanner(System.in);
}
