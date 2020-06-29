import java.util.Scanner;
public class J2812 {
    static long[] prime = new long[10000];

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        getprime();
        while (cin.hasNext()) {
            int n = cin.nextInt();
            System.out.println(prime[n - 1]);
        }
        cin.close();
    }

    public static void getprime() {
        prime[0] = 2;
        prime[1] = 3;
        int j = 2;
        for (int i = 4; j < 10000; i++) {
            if (isprime(i)) {
                prime[j] = i;
                j++;
            }
        }
    }

    private static boolean isprime(int i) {
        boolean flag = false;
        int k;
        for (k = 2; k < i; k++) {
            if (i % k == 0) break;
        }
        if (k == i) flag = true;
        return flag;
    }
}