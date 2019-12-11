import java.util.Scanner;

public class J1116 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int k = 0, N = cin.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 7 == 0 || Integer.toString(i).contains("7")) k++;
        }
        System.out.println(k);
        cin.close();
    }
}
