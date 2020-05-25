/**
 * @author MWD
 * @date 2020年5月25日 0025 20:26
 */

import java.util.Scanner;

public class J1586 {
    static int n;
    static int[] box;
    static int[] visited;

    public static void dfs(int step) {
        if (step >= n) {
            for (int i = 0; i < n; i++) {
                System.out.print(box[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                box[step] = i;
                visited[i] = 1;
                dfs(step + 1);
                visited[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        box = new int[n];
        visited = new int[n + 1];
        dfs(0);
    }
}