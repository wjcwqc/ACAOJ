public class Isprime_a {
    static final int max = 100000;
    static int[] p = new int[max];

    public static boolean isprime(int a) {
        return p[a] == 0;
    }

    public static void initial() {
        for (int i = 2; i < max; i++) {
            if (p[i] == 1) continue;
            for (int x = 2 * i; x < max; x += i) {
                if (p[x] == 1) continue;
                p[x] = 1;
            }
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        initial();
        for (int i = 2; i < max; i++) {
            if (isprime(i))
                System.out.printf("%d,", i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
