import java.util.Scanner;

public class J1146 {
    private static int sum = 0;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int N = cin.nextInt();
            if (N == 0) break;
            if (CubeNum(N)) sum++;
        }
        System.out.println(sum);
        cin.close();
    }

    private static boolean CubeNum(int N) {
        if (N == 1) return true;
        float n = (float) Math.pow(N, 1.0 / 3);
        return Math.pow(n, 3) == N;
    }
}
