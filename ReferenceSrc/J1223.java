import java.util.Scanner;

public class J1223 {
    private static String[] ss = new String[10000];
    private static int k = 0;

    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = cn.nextInt();
        permutation(a, 0, n - 1);
        if (n < 5) {
            for (int i = 0; i < k; i++) {
                for (int j = i + 1; j < k; j++) {
                    if (ss[i].compareTo(ss[j]) > 0) {
                        String te = ss[j];
                        ss[j] = ss[i];
                        ss[i] = te;
                    }
                }
            }
            for (int i = 0; i < k; i++) {
                System.out.println(ss[i]);
            }
        } else {
            for (int i = 0; i < k; i++) {
                System.out.println(ss[i]);
            }
        }
    }

    public static void permutation(int[] s, int from, int to) {
        if (to <= 1)
            return;
        if (from == to) {
            ss[k] = "";
            for (int z = 0; z < s.length; z++)
                ss[k] += String.valueOf(s[z]);
            k++;
        } else {
            for (int i = from; i <= to; i++) {
                swap(s, i, from);
                permutation(s, from + 1, to);
                swap(s, from, i);
            }
        }
    }

    public static void permutation1(int[] s, int from, int to) {
        if (to <= 1)
            return;
        if (from == to) {
            for (int z = 0; z < s.length; z++)
                System.out.print(s[z]);
            System.out.println();
        } else {
            for (int i = from; i <= to; i++) {
                swap(s, i, from);
                permutation(s, from + 1, to);
                swap(s, from, i);
            }
        }
    }

    public static void swap(int[] s, int i, int j) {
        int tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
    }
}