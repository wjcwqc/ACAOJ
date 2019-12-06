import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Problem_2577 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Double> man = new ArrayList<>();
        ArrayList<Double> woman = new ArrayList<>();
        int n = cin.nextInt();
        while (n-- > 0) {
            String sex = cin.next();
            double high = cin.nextDouble();
            if (sex.equals("male")) {
                man.add(high);
            } else if (sex.equals("female")) {
                woman.add(high);
            }
        }
        Collections.sort(man);
        Collections.sort(woman, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return (int) Math.floor(o2 - o1);
            }
        });
        //System.out.println(man);
        //System.out.println(woman);
        for (Double a : man) {
            System.out.print(String.format("%.2f", a) + " ");
        }
        for (Double a : woman) {
            System.out.print(String.format("%.2f", a) + " ");
        }
    }
}
