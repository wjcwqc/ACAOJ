import java.util.Scanner;

public class J1248 {
    static class Color {
        private String name;
        private int math;

        public Color(String name, int math) {
            super();
            this.name = name;
            this.math = math;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMath() {
            return math;
        }

        public void setMath(int math) {
            this.math = math;
        }

        public static void main(String[] args) {
            Scanner cn = new Scanner(System.in);
            while (cn.hasNext()) {
                int n = cn.nextInt();
                if (n == 0) return;
                Color[] co = new Color[n];
                for (int i = 0; i < n; i++) {
                    String str = cn.next();
                    co[i] = new Color(str, 0);
                }
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i; j < n; j++) {
                        if (co[i].getName().equals(co[j].getName())) {
                            int z = co[i].getMath();
                            co[i].setMath(++z);
                        }
                    }
                }
                int max = co[0].getMath();
                for (int i = 0; i < n; i++) {
                    if (max < co[i].getMath()) {
                        max = co[i].getMath();
                    }
                }
                for (int i = 0; i < n; i++) {
                    if (co[i].getMath() == max) {
                        System.out.println(co[i].getName());
                        break;
                    }
                }
            }
        }
    }
}