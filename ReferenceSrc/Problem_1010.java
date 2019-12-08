import java.util.Scanner;

public class Problem_1010 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        int N = Integer.parseInt(s);
        if (N >= 1000 || N < 100) return;
        int a = Integer.parseInt(s.charAt(0)+"");
        int b = Integer.parseInt(s.charAt(1)+"");
        int c = Integer.parseInt(s.charAt(2)+"");
        int x1 = a*a*a, x2 = b*b*b, x3 = c*c*c;
        if (N == x1 + x2 + x3) System.out.println(1);
        else System.out.println(0);
        cin.close();
    }
}