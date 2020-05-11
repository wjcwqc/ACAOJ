import java.util.Arrays;
import java.util.Scanner;

public class J1264 {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int total = 0;
        int n = cin.nextInt();
        Place[] loc = new Place[n];
        for (int i = 0; i < n; i++) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            loc[i] = new Place(a, b);
        }
        Arrays.sort(loc);
        for (int i = 1; i <= loc.length - 1; i++) {
            if (loc[i].getA() >= loc[i-1].getB()) {
                total++;
            } else {
                loc[i].setA(loc[i-1].getA());
                loc[i].setB(loc[i-1].getB());
            }
        }
        System.out.println(total+1);
    }


}
class Place implements Comparable<Place> {
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

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Place{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public int compareTo(Place o) {
        if (this.getB() >= o.getB()) {
            return 1;
        } else {
            return -1;
        }
    }
}