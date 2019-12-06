import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Problem_1341 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Map<Integer, Integer> map = new TreeMap<>();
        int n = cin.nextInt();
        for (int i = 0; i < n; i++) {
            int x = cin.nextInt();
            if (!map.containsKey(x)) {
                map.put(x, 1);
            } else {
                Integer it = map.get(x);
                map.put(x, ++it);
            }
        }
        int num = 20000000;
        int max = 0;
        Set<Integer> set = map.keySet();
        for (Integer a : set) {
            Integer b = map.get(a);
            if (b > max) {
                max = b;
                num = a;
            }
        }
        System.out.println(num);
        System.out.println(max);
    }
}
