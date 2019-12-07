
public class binarysearch {
    static final int max = 9998;
    static int[] m = new int[max];

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < max; i++) {
            m[i] = i;
        }
        for (int p = 1; p < max; p++) {
            System.out.println(find(p));
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static int find(int p) {
        int rst = -1;
        int i = (m.length + 1) / 2;
        int l = (i + 1) / 2;
        while (l > 0) {
//            System.out.println("l="+l);
//            System.out.println("i="+i);
            if (p == m[i]) {
                rst = i;
                break;
            } else if (p > m[i]) {
                i = i + l;
            } else {
                i = i - l;
            }
            l = (l + 1) / 2;
        }
        return rst;
    }
}
