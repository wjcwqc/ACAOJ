import java.util.Scanner;

public class Problem_1028 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt();
        System.out.println(fun(x));
    }

    private static int fun(int N) {
        if (N == 1) return 10;
        else return fun(N - 1) + 2;
    }
}
