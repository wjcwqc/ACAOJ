/**
 * @author MWD
 * @date 2020年6月12日 0012 22:03
 */
import java.util.Scanner;

public class J2813 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int nv = cin.nextInt();//1~nv
        int ne = cin.nextInt();
        int[] D = new int[nv + 1];
        for (int i = 1; i <= ne; i++) {
            int x = cin.nextInt();
            int y = cin.nextInt();
            D[x]++;
            D[y]++;
        }
        int from = cin.nextInt();
        int to = cin.nextInt();
        if (from == to) {//欧拉环
            boolean flag = true;
            for (int i = 1; i <= nv; i++) {
                if (D[i] % 2 == 1) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        } else {//欧拉路径
            boolean flag = D[from] % 2 == 1 && D[to] % 2 == 1;
            for (int i = 1; i <= nv; i++) {
                if (i == from || i == to) continue;
                if (D[i] % 2 == 1) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }

    }
}
