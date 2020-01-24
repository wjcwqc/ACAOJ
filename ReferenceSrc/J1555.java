import java.util.Scanner;

public class J1555 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int temp = 1;
            int N = cin.nextInt();
            for (int i = N; i >= 0; i -= 2) {
                if (i == 0) {
                    i = 1;
                    temp *= i;
                }
                temp *= i;
            }
            System.out.println(temp);
        }
    }
}
