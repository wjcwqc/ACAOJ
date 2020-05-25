/**
 * @author MWD
 * @date 2020年5月25日 0025 20:30
 */
import java.util.Scanner;

public class J2000 {
    public static int map[][];
    public static int next[][] = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        while (N-- > 0) {
            int m = cin.nextInt();
            int n = cin.nextInt();
            map = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = cin.nextInt();
                }
            }
            int color = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] == 1) {
                        dfs(i, j, --color);
                    }
                }
            }
            System.out.println(-color);
        }
    }

    public static void dfs(int x, int y, int color) {
        if (x < 0 || x >= map.length || y < 0 || y >= map[x].length) {
            return;
        }
        if (map[x][y] == 1) {
            map[x][y] = color;
            for (int i = 0; i < next.length; i++) {
                int nx = x + next[i][0];
                int ny = y + next[i][1];
                dfs(nx, ny, color);
            }
        }
    }

}
