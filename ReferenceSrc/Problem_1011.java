import static java.lang.Math.pow;

public class Problem_1011 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            String s = String.valueOf(i);
            int a = s.charAt(0), b = s.charAt(1), c = s.charAt(2);
            int x1 = (int) pow(a, 3), x2 = (int) pow(b, 3), x3 = (int) pow(c, 3);
            if (i == x1 + x2 + x3) System.out.println(i);
        }
    }
}