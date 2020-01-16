import java.util.Scanner;

public class J1306 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        String str = cn.next();
        int index = str.indexOf("@");
        str = str.substring(0, index);
        System.out.println(str);
    }
}