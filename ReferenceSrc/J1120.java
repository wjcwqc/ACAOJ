import java.util.*;

public class J1120 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (cin.hasNext()) {
            String s = cin.next();
            list.add(s);
        }
        list.sort((o1, o2) -> {
            String[] s1 = o1.split("/");
            String[] s2 = o2.split("/");
            int d = Integer.parseInt(s1[2]) - Integer.parseInt(s2[2]);
            if (d != 0) return d;
            d = Integer.parseInt(s1[1]) - Integer.parseInt(s2[1]);
            if (d != 0) return d;
            return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
        });
        list.forEach(System.out::println);
        cin.close();
    }
}
