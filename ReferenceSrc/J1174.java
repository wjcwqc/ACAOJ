import java.util.Scanner;

public class J1174 {

    static class Place {
        private int a;
        private int b;

        public Place(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int getA() {
            return this.a;
        }

        public int getB() {
            return this.b;
        }

        public static void main(String[] args) {
            Scanner cn = new Scanner(System.in);
            int n = cn.nextInt();
            Place[] loc = new Place[n];
            for (int i = 0; i < n; i++) {
                int a = cn.nextInt();
                int b = cn.nextInt();
                loc[i] = new Place(a, b);
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (loc[i].getB() > loc[j].getB()) {
                        Place ll = loc[j];
                        loc[j] = loc[i];
                        loc[i] = ll;
                    }
                }
            }

            int max = 0, x = 1, t = 0, i = 0;

            while (t != x) {
                int counts = 0, y = 0;
                t = x;
                for (int j = i + 1; j < n; j++) {
                    if (loc[i].getB() <= loc[j].getA()) {
                        counts++;
                        i = j;
                    } else {
                        y++;
                        if (y < 2)
                            x = j;
                    }
                }
                if (max < counts)
                    max = counts;
                i = x;
            }
            System.out.println(max + 1);
        }
    }
}
