import java.util.Scanner;

public class J1562 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String s1 = cin.next();
            String s = cin.nextLine();
            String s2 = s.substring(1);
            boolean b1 = isNumeric(s1);
            boolean b2 = isNumeric(s2);
            isNumber(b1, s1);
            System.out.print(" " + "+" + " ");
            isNumber(b2, s2);
            System.out.print(" " + "=" + " ");
            if (b1 && b2) {
                int N = Integer.parseInt(s1) + Integer.parseInt(s2);
                System.out.print(N);
            } else System.out.print("?");
            System.out.println();
        }
        cin.close();
    }

    private static void isNumber(boolean b, String str) {
        if (b) {
            System.out.print(Integer.parseInt(str));
        } else System.out.print("?");
    }

    private static boolean isNumeric(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        if (str.length() > 4 || "0".equals(str)) return false;
        return str.length() != 4 || Integer.parseInt(str) <= 1000;
    }

}
