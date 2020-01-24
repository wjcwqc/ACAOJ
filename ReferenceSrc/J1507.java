import java.util.Scanner;

public class J1507 {
    private static int[] Fn = {1, 2, 4, 8, 16, 32, 64, 128, 256,
            512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144,
            524288, 1048576, 2097152, 4194304, 8388608};
    private static int[] arr = {0, 1, 2, 3, 4, 5, 6, 7,
            8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int m = cin.nextInt(), n = cin.nextInt();
            int x = twomore(m), y = twomore(n);
            if (x == y) System.out.println("=");
            else if (x > y) System.out.println(">");
            else System.out.println("<");
        }
        cin.close();
    }

    private static int twomore(int N) {
        if (N % 2 != 0) return 0;
        for (int i = 23; i >= 0; i--) {
            if (N >= Fn[i] && N % Fn[i] == 0) {
                N = arr[i];
                break;
            }
        }
        return N;
    }
}
