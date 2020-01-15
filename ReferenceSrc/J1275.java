import java.util.Scanner;

public class J1275 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt(), b = cin.nextInt(), c = cin.nextInt();
        double S = (a + b + c) / 3.0;
        System.out.println(String.format("%.3f", S));
        cin.close();
    }
}
