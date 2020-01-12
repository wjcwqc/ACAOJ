import java.util.Scanner;

public class J1191 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int a = (int) Math.pow(n, 1.0 / 3);
            int b = (int) Math.pow(a, 3);
            if (b == n)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        cin.close();
    }
}
