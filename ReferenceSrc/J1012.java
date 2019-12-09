public class J1012 {
    public static void main(String[] args) {
        int a;
        for (a = 0; ; a++) {
            if (((a * 8 + 7) * 8 + 1) * 8 + 1 == (34 * a + 15) * 17 + 4) {
                System.out.println((34 * a + 15) * 17 + 4);
                break;
            }
        }
    }
}