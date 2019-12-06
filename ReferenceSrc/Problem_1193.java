import java.util.Scanner;

public class Problem_1193 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[][] g = new int[n][3];
        String[][] p = new String[n][3];
        for (int i = 0; i < n; i++) {
            p[i][0] = cin.next();
            g[i][0] = cin.nextInt();
            g[i][1] = cin.nextInt();
            p[i][1] = cin.next();
            p[i][2] = cin.next();
            g[i][2] = cin.nextInt();
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            g[i][0] = m(g[i][0], g[i][1], p[i][1], p[i][2], g[i][2]);
            sum += g[i][0];
            if (g[max][0] < g[i][0]) {
                max = i;
            }
        }
        System.out.println(p[max][0]);
        System.out.println(g[max][0]);
        System.out.println(sum);
    }

    public static int m(int a, int b, String c, String d, int e) {
        int rst = 0;
        if (a > 80 && e > 0) rst += 8000;
        if (a > 85 && b > 80) rst += 4000;
        if (a > 90) rst += 2000;
        if (a > 85 && d.equals("Y")) rst += 1000;
        if (b > 80 && c.equals("Y")) rst += 850;
        return rst;
    }

}
