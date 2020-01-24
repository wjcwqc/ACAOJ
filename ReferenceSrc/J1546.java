import java.util.*;

public class J1546 {
    private static Map<String, Integer> map = new HashMap<>();

    static {
        map.put("one", 1);map.put("two", 2);map.put("three", 3);map.put("four", 4);
        map.put("five", 5);map.put("six", 6);map.put("seven", 7);map.put("eight", 8);
        map.put("nine", 9);map.put("zero", 0);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String str = cin.nextLine();
            fun(str);
        }
    }

    private static void fun(String str) {
        int m = 1, n = 1;
        String s1 = str.substring(0, str.indexOf("+") - 1);
        String s2 = str.substring(str.indexOf("+") + 2, str.indexOf("=") - 1);
        String[] ar1 = s1.split("\\p{Blank}");
        String[] ar2 = s2.split("\\p{Blank}");
        int a = map.get(ar1[ar1.length - 1]);
        int b = map.get(ar2[ar2.length - 1]);
        if (ar1.length >= 2) {
            for (int i = ar1.length - 2; i >= 0; i--) {
                a += map.get(ar1[i]) * Math.pow(10, n);
                n++;
            }
        }
        if (ar2.length >= 2) {
            for (int i = ar2.length - 2; i >= 0; i--) {
                b += map.get(ar2[i]) * Math.pow(10, m);
                m++;
            }
        }
        System.out.println(a + b);
    }
}
