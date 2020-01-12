import java.util.Scanner;

public class J1199 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            long a = cin.nextLong();
            long b = cin.nextLong();
            if (a == 0 && b == 0) return;
            System.out.println(a + b);
        }
    }
}
