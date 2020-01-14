import java.util.Scanner;

public class J1231 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int x1 = cin.nextInt(), y1 = cin.nextInt();
            int x2 = cin.nextInt(), y2 = cin.nextInt();
            int x3 = cin.nextInt(), y3 = cin.nextInt();
            if (x1 == 0 && x2 == 0 && x3 == 0 && y1 == 0 && y2 == 0 && y3 == 0) return;
            if ((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1) < 0) System.out.println(1);
            else System.out.println(0);
        }
        cin.close();
    }
}
