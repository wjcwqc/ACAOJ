import java.util.Scanner;

public class J1083 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n >= 0) {
                String str1 = Integer.toBinaryString(n);
                System.out.println(String.format("%d-->%s", n, str1));
            } else {
                String str2 = Integer.toBinaryString(Math.abs(n));
                System.out.println(String.format("%d-->-%s", n, str2));
            }
        }
    }
}