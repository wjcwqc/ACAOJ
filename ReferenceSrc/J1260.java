import java.util.Scanner;

public class J1260 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()) {
            String str = cn.next();
            String str1 = cn.next();
            int length = str.length();
            int length1 = str1.length();
            int count = 0;
            int t = str.indexOf(str1);
            while (t >= 0 && length >= length1) {
                t = str.indexOf(str1);
                str = str.substring(t + length1 - 1);
                count++;
            }
            System.out.println(count - 1);
        }
    }
}