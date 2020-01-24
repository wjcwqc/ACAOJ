import java.util.Scanner;

public class J1569 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int N = cin.nextInt();
            int M = cin.nextInt();
            N = (M + 1) * M * (N + 1) * N / 4;
            System.out.println(N);
        }
        cin.close();
    }
}
