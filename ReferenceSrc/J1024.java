import java.util.Scanner;

public class J1024 {
    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int N = cin.nextInt();
        long sum = 0, temp = 1;
        for (int i = 1; i <= N; i++) {
            temp *= i;
            sum += temp;
        }
        System.out.println(sum);
        cin.close();
    }
}