import java.util.Scanner;

public class J1087 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String s = cin.nextLine();
            String[] arr = s.trim().split("\\s+");
            for (String s1 : arr) {
                System.out.print(s1);
            }
            System.out.println();
        }
        cin.close();
    }
}
