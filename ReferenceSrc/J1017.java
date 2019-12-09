import java.util.Scanner;

public class J1017 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String N = cin.next();
        System.out.println(N + (new StringBuilder(N).reverse()).toString());
    }
}