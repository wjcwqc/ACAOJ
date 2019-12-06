import java.util.Scanner;

import static java.lang.Math.pow;


public class Problem_1010 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        String s = String.valueOf(N);
        if (N >= 1000 || N < 100) return;
        int a = s.charAt(0), b = s.charAt(1), c = s.charAt(2);
        int x1 = (int) pow(a, 3), x2 = (int) pow(b, 3), x3 = (int) pow(c, 3);
        if (N == x1 + x2 + x3) System.out.println(1);
        else System.out.println(0);
        cin.close();
    }
}