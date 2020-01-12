import java.util.*;

@SuppressWarnings("all")
public class J1200 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        for (int i = 0; i < N; i++) {
            StringBuilder Sb = new StringBuilder();
            String s = cin.next();
            int len = s.length();
            for (int j = 0; j < len; j++) {
                char c = s.charAt(j);
                if (c != '-') {
                    int nul;
                    if (c >= '0' && c <= '9') nul = (c - '0');
                    else nul = getNum(c);
                    Sb.append(nul);
                }
            }
            String key = Sb.toString();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else map.put(key, 1);
        }
        Object[] keys = map.keySet().toArray();
        Arrays.sort(keys);
        boolean ok = false;
        for (Object st : keys) {
            String s = (String) st;
            if (map.get(s) > 1) {
                ok = true;
                System.out.println(s.substring(0, 3) + "-" + s.substring(3) + " " + map.get(s));
            }
        }
        if (!ok) System.out.println("No duplicates.");
    }

    private static int getNum(char c) {
        if (c == 'A' || c == 'B' || c == 'C') return 2;
        else if (c == 'D' || c == 'E' || c == 'F') return 3;
        else if (c == 'G' || c == 'H' || c == 'I') return 4;
        else if (c == 'J' || c == 'K' || c == 'L') return 5;
        else if (c == 'M' || c == 'N' || c == 'O') return 6;
        else if (c == 'P' || c == 'R' || c == 'S') return 7;
        else if (c == 'T' || c == 'U' || c == 'V') return 8;
        else return 9;
    }

}
