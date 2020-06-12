/**
 * @author MWD
 * @date 2020年6月12日 0012 22:08
 */
import java.util.Scanner;

public class J2088 {
    private static final int INF = Integer.MAX_VALUE;
    static int w[][]; // 边的价值，w[from][to]
    static int n, m; // m为边数，n为顶点数

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            n = cin.nextInt();

            w = new int[n + 1][n + 1];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    w[i][j] = cin.nextInt();
                    if (i != j && w[i][j] == 0)
                        w[i][j] = INF;
                }
            }

            floyd();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (w[i][j] == INF) w[i][j] = -1;
                    System.out.print(w[i][j] + " ");
                }
                System.out.println();
            }
        }
        cin.close();
    }

    private static void floyd() {//动态规划 O(n^3) 计算出任意两个点之间的最短路径
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (w[i][k] < INF && w[k][j] < INF)
                        w[i][j] = Math.min(w[i][j], w[i][k] + w[k][j]);
                }
            }
        }
    }
}
