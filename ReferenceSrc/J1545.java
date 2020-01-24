import java.util.Scanner;

public class J1545 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String str = cin.next();
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                sum += (str.charAt(i) - '0');
            }
            System.out.println(sum);
        }
        cin.close();
    }
}
