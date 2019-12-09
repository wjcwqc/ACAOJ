import java.util.Scanner;

public class J1003 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        System.out.println(str.replace("\\S",""));
    }
}

