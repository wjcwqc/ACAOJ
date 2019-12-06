import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Problem_2606 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        ArrayList<Integer>[] arr = new ArrayList[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }
        int q = cin.nextInt();
        while (q-- > 0) {
            int x = cin.nextInt();
            if (x == 0) {
                int y = cin.nextInt();
                int z = cin.nextInt();
                arr[y].add(z);
            } else if (x == 1) {
                int y = cin.nextInt();
                if (arr[y].size() == 0) {
                    System.out.println();
                } else {
                    for (int i = 0; i < arr[y].size(); i++) {
                        int j = arr[y].get(i);
                        if (i == arr[y].size() - 1) {
                            System.out.println(j);
                        } else {
                            System.out.print(j + " ");
                        }
                    }
                }
            } else if (x == 2) {
                int y = cin.nextInt();
                if (y < n) {
                    if (arr[y].size() > 0) {
                        Iterator<Integer> it = arr[y].iterator();
                        while (it.hasNext()) {
                            it.next();
                            it.remove();
                        }
                    }

                }

            }
        }

    }
}
