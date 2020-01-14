import java.util.Scanner;

public class J1225 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        cn.nextLine();
        while (n-- > 0) {
            String str = cn.nextLine();
            if (!Character.isLetter(str.charAt(0)) && str.charAt(0) != '_') {
                System.out.println("no");
                continue;
            }
            int i = 1;
            for (; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))
                        || Character.isDigit(str.charAt(i))
                        || str.charAt(i) == '_')
                    continue;
                else
                    break;
            }
            if (i == str.length())
                System.out.println("yes");
            else
                System.out.println("no");
        }
        cn.close();
    }
}