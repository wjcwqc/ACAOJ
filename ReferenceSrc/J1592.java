/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/6/14 上午1:13
 */

import java.util.*;

public class J1592 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (sc.hasNext()) {
            int n = sc.nextInt(),
                    m = sc.nextInt(),
                    start = sc.nextInt(),
                    end = sc.nextInt();
            int[] route[] = new int[n + 1][n + 1];
            for (int k = 0; k < m; k++) {
                int i = sc.nextInt(),
                        j = sc.nextInt();
                route[i][j] = route[j][i] = 1;
            }
            if (start == end) {
                System.out.println("0");
                continue;
            }
            int c = bfs(route, n, start, end);
            if (c == 0) System.out.println("Connot reach");
            else System.out.println(c);
        }
        sc.close();
    }

    private static class R {
        int x, step;

        R(int x, int step) {
            this.x = x;
            this.step = step;
        }
    }

    private static int bfs(int[][] r, int n, int s, int e) {
        Queue<R> queue = new LinkedList<R>();
        for (int i = 1; i <= n; i++)
            if (r[s][i] == 1) {
                r[s][i] = 0;
                queue.add(new R(i, 1));
            }
        while (!queue.isEmpty()) {
            R t = queue.poll();
            int j = t.x;
            int step = t.step;
            if (j == e) return step;
            for (int i = 1; i <= n; i++)
                if (r[j][i] == 1) {
                    r[j][i] = 0;
                    queue.add(new R(i, step + 1));
                }
        }
        return 0;
    }
}