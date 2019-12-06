import java.util.Scanner;

public class Problem_2575 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            double x = cin.nextDouble();
            double y = cin.nextDouble();
            if (Math.abs(x) <= 1 && Math.abs(y) <= 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        cin.close();
    }
}
