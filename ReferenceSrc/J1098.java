import java.util.Scanner;

public class J1098 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        char[] arr = cin.next().toCharArray();
        int tot = 1, a = 0;
        for (int i = 1; i < N; i++) {
            tot *= (i + 1);
            if (arr[i - 1] == arr[i]) ++a;
        }
        for (int i = 0; i < a; i++) {
            tot /= 2;
        }
        System.out.println(tot);
        cin.close();
    }
}
