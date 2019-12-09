import java.util.Scanner;

public class J1288 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()) {
            int n = cin.nextInt();
            int sum = 0;
            if (n > 24) {
                n = 24;
            }
            for (int i = 1; i <= n; i++) {
                sum = l(sum + u(i));
            }
            System.out.println(l(sum));
        }
    }

    private static int u(int a) {
        int rst = 1;
        for (int i = 2; i <= a; i++) {
            rst = l(rst * i);
        }
        return rst;
    }

    private static int l(int a) {
        return a % 1000000;
    }
}
