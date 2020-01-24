import java.util.Scanner;

public class J1527 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int N = cin.nextInt();
            long x = (long) (Math.pow(N + 1, 3) + 5 * (N + 1)) / 6 + 1;
            System.out.println(x);
        }
    }
}
