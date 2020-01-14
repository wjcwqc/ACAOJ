import java.util.Scanner;

public class J1227 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        while (n-->0) {
            String string = cin.next();
            String str = string.replaceAll("\\D+", "");
            System.out.println(str.length());
        }
        cin.close();
    }
}