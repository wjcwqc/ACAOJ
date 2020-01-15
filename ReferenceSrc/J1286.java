public class J1286 {
    public static void main(String[] args) {
        for (int i = 1111; i < 9999; i++) {
            int s = (int) Math.sqrt(i);
            if (s * s == i) {
                int a = i / 1000;
                int c = i / 100 % 10;
                int b = i % 10;
                int d = i / 10 % 10;

                if (a == c && b == d) {
                    System.out.println(i);
                }
            }
        }
    }
}