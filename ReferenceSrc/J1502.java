import java.util.Scanner;

public class J1502 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int n = cin.nextInt();
            long sum = 0, tot = 0;
            for (int i = 0; i < n; i++) {
                sum = (sum * 10 + a);
                tot += sum;
            }
            System.out.println(tot);
        }
        cin.close();
    }
}
