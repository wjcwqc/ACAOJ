import java.util.Scanner;

public class J1202 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int N = cin.nextInt();
            char[] arr = String.valueOf(N).toCharArray();
            int sum = 0;
            for (char c : arr) {
                sum += c - '0';
            }
            if (N % sum == 0) System.out.println("Lucky Word");
            else System.out.println("No Answer");
        }
    }
}
