import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J1572 {

    static class Tube{
        int len;
        int mm;
        int num;

        public Tube(int len, int mm, int num) {
            this.len = len;
            this.mm = mm;
            this.num = num;
        }

        public Tube() {
        }


        public int getLen() {
            return len;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public void setLen(int len) {
            this.len = len;
        }

        public int getMm() {
            return mm;
        }

        public void setMm(int mm) {
            this.mm = mm;
        }

        @Override
        public String toString() {
            return "Tube{" +
                    "len=" + len +
                    ", mm=" + mm +
                    ", num=" + num +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        while (N-->0){
            int m = cin.nextInt();
            Tube[] tube = new Tube[m];
            for (int i = 0; i < m; i++) {
                int x= cin.nextInt();
                int y= cin.nextInt();
                int z= cin.nextInt();
                tube[i] = new Tube(x,y,z);
            }
            Arrays.sort(tube, new Comparator<Tube>() {
                @Override
                public int compare(Tube o1, Tube o2) {
                    int flag1 = Integer.compare(o1.getLen(),o2.getLen());
                    if (flag1 != 0) {
                        return -flag1;
                    }else{
                        int flag2 = Integer.compare(o1.getMm(),o2.getMm());
                        if (flag2!=0){
                            return flag2;
                        }else {
                            return -Integer.compare(o1.getNum(),o2.getNum());
                        }

                    }
                }
            });
            System.out.println(tube[0].getNum());

        }
    }
}
