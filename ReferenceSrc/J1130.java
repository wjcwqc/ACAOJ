import java.util.Scanner;

public class J1130 {
    private static int[] cows = new int[50];

    static {
        for (int i = 0; i < cows.length; i++) {
            if (i < 3) cows[i] = 1;
            else if (i < 6) cows[i] = i - 1;
            else cows[i] = cows[i - 1] + cows[i - 3];
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        System.out.println(cows[N - 1]);
        cin.close();
    }
}
