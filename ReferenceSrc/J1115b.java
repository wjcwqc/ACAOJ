import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class J1115b {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i <= 9; i++) {
            map.put(i, 0);
        }
        int N = cin.nextInt();
        for (int i = 1; i <= N; i++) {
            int flag = i;
            while (flag != 0) {
                int temp = flag % 10;
                if (map.containsKey(temp)) {
                    Integer x = map.get(temp);
                    map.put(temp, ++x);
                }
                flag /= 10;
            }
        }
        Set<Integer> it = map.keySet();
        for (Integer a : it) {
            System.out.println(map.get(a));
        }
    }
}
