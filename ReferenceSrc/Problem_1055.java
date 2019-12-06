import java.util.Scanner;

public class Problem_1055 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();
        int[] f = new int[m];
        int[] g = new int[n];
        for (int i = 0; i < f.length; i++) {
            f[i] = cin.nextInt();
        }
        for (int i = 0; i < g.length; i++) {
            g[i] = cin.nextInt();
        }
        int min = Math.abs(f[0] - g[0]);
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < g.length; j++) {
                if (Math.abs(f[i] - g[j]) < min) {
                    min = Math.abs(f[i] - g[j]);
                }
            }
        }
        System.out.println(min);
    }
}
