import java.util.Scanner;

public class J1316 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int M = cin.nextInt();
            int N = cin.nextInt();
            long sum = (N + M) * (N + M + 1) / 2 + M + 1;
            System.out.println(sum);
        }
    }


}
