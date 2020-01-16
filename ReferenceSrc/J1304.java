import java.util.Scanner;

public class J1304 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        if (N < 1 || N > 9) return;
        int sum = 0, temp = 1;
        for (int i = 1; i <= N; i++) {
            temp *= i;
            sum += temp;
        }
        System.out.println(sum);
    }
}
