import java.util.Scanner;

public class J1009 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            TomNumber(cin.nextInt());
        }
        cin.close();
    }

    private static void TomNumber(int N) {
        char[] arr = String.valueOf(N).toCharArray();
        int sum = 0;
        for (char c : arr) {
            sum += c - '0';
        }
        System.out.println(sum);
    }
}