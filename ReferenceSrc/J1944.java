/**
 * @author MWD
 * @date 2020年5月29日 0029 15:49
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J1944 {

    public static int bfs(char [][] map, int [] begin, int [] end) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int[][] d = new int [map.length][map[0].length];

        Queue<int []> que = new LinkedList<int []>();

        for(int i = 0; i < d.length; i++) {
            for(int j = 0; j < d[0].length; j++) {
                d[i][j] = Integer.MAX_VALUE;
            }
        }

        que.offer(begin);

        d[ begin[0] ][ begin[1] ] = 0;

        while(!que.isEmpty()) {

            int [] current = que.poll();

            if(current[0] == end[0] && current[1] == end[1]) {
                break;
            }

            for(int i = 0; i < 4; i++) {

                int ny = current[0] + dy[i];
                int nx = current[1] + dx[i];

                if(ny >= 0 && ny < d.length && nx >= 0 && nx < d[0].length && map[ny][nx] != '#' && d[ny][nx] == Integer.MAX_VALUE) {

                    d[ny][nx] = d[current[0]][current[1]] + 1;

                    int[] c = {ny, nx};
                    que.offer(c);

                }
            }
        }

        return d[end[0]][end[1]];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String t = sc.nextLine();

        char [][] map = new char [n][m];

        int[] begin = new int [2];
        int[] end = new int [2];

        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            map[i] = s.toCharArray();

            if(s.contains("S")) {
                begin[0] = i;
                begin[1] = s.indexOf("S");
            }
            if(s.contains("G")) {
                end[0] = i;
                end[1] = s.indexOf("G");
            }
        }
        System.out.println(bfs(map, begin, end));

    }
}
