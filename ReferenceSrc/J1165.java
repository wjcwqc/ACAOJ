import java.math.BigInteger;
import java.util.Scanner;

@SuppressWarnings("all")
public class J1165 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String str = new BigInteger(cin.next()).toString(2);
            System.out.println(str);
        }
        cin.close();
    }
}
