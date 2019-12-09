import static java.lang.Math.pow;

public class J1011 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            String s = i+"";
            int a = Integer.parseInt(s.charAt(0)+""), b = Integer.parseInt(s.charAt(1)+""), c = Integer.parseInt(s.charAt(2)+"");
            int x1 = (int) pow(a, 3), x2 = (int) pow(b, 3), x3 = (int) pow(c, 3);
            if (i == x1 + x2 + x3) System.out.println(i);
        }
    }
}