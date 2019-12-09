import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class J1221 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();
        String str = cin.nextLine();
        String[] sp = str.split(" ");
        System.out.println(sp.length);
        for (int i = 0; i < sp.length; i++) {
            if (!map.containsKey(sp[i])) {
                map.put(sp[i], 1);
            } else {
                Integer temp = map.get(sp[i]);
                map.put(sp[i], ++temp);
            }
        }
        Set<String> set = map.keySet();
        for (String a : set) {
            Integer b = map.get(a);
            System.out.println(a + ":" + b);
        }
        //System.out.println(map);
    }
}
