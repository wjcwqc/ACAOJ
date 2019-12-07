import java.util.Scanner;

public class Problem_1026 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int N = cin.nextInt();
        if (a > 9 || N < 1) return;
        int temp = 0, sum = 0;
        for (int i = 0; i < N; i++) {
            temp = temp * 10 + a;
            sum += temp;
        }
        System.out.println(sum);
    }
}