/**
 * @author MWD
 * @date 2020年6月12日 0012 22:05
 */
import java.util.*;

public class J1590 {
    static class Point {
        int x, y, z;

        public Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public String toString() {
            return String.format("(%d %d)%d ", x, y, z);
        }

        @Override
        public boolean equals(Object that) {
            if (that instanceof Point) {
                Point p = (Point) that;
                return this.x == p.x && this.y == p.y;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return x + 100000 * y;
        }
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();

            HashSet<Point> points = new HashSet<>();
            HashMap<Point, Boolean> vis = new HashMap<>();
            for (int x = 1; x <= n; x++)
                for (int y = 1; y <= m; y++) {
                    if (cin.nextInt() == 1) continue;
                    Point pt = new Point(x, y, -1);
                    points.add(pt);
                    vis.put(pt, false);
                }
            int ex = cin.nextInt();
            int ey = cin.nextInt();
            int sx = cin.nextInt();
            int sy = cin.nextInt();
            Point start = new Point(sx, sy, 0);
            Point end = new Point(ex, ey, -1);
            for (Point pt : points) {
                if (pt.x == sx && pt.y == sy) {
                    start = pt;
                    pt.z = 0;
                    points.remove(start);
                    break;
                }

            }


            Queue<Point> Q = new LinkedList<Point>();
            Q.offer(start);
            vis.put(start, true);
            while (!Q.isEmpty()) {
                Point h = Q.peek();
                if (h.x == ex && h.y == ey) {
                    end = h;
                    break;
                }
                Q.poll();
                for (int i = 0; i < 4; i++) {
                    Point np = new Point(h.x + next[i][0], h.y + next[i][1], h.z + 1);
                    if (points.contains(np) && !vis.get(np)) {
                        Q.offer(np);
                        vis.put(np, true);
                    }
                }
            }
            if (end.z == -1) System.out.println("No Way!");
            else System.out.println(end.z);
        }
    }

    static int[][] next = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    static Scanner cin = new Scanner(System.in);
}
