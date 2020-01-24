import java.util.*;

public class J1543 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            Set<Integer> set = new TreeSet<>();
            Map<Integer, Integer> map = new HashMap<>();
            int[] arr = new int[cin.nextInt()];
            for (int i = 0; i < arr.length; i++) {
                int temp = cin.nextInt();
                arr[i] = temp;
                set.add(temp);
            }
            int i = 1;
            for (Integer x : set) {
                map.put(x, i++);
            }
            boolean first = true;
            for (int value : arr) {
                if (first) first = false;
                else System.out.print(" ");
                System.out.print(map.get(value));
            }
            System.out.println();
        }
    }
}
