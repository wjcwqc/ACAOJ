import java.util.Scanner;

public class J1505 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String A = cin.next();
            StringBuilder str = new StringBuilder(cin.next());
            int N = Integer.parseInt(A) + Integer.parseInt(str.reverse().toString());
            System.out.println(N);
        }
    }
}
