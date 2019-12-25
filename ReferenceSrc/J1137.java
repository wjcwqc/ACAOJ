import java.util.Scanner;

//public class J1137{
//    static final int max = 109;
//    static int[] p = new int[max];
//
//    public static boolean isprime(int a) {
//        return p[a] == 0;
//    }
//
//    public static void initial() {
//        for (int i = 2; i < max; i++) {
//            if (p[i] == 1) continue;
//            for (int x = 2 * i; x < max; x += i) {
//                if (p[x] == 1) continue;
//                p[x] = 1;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        initial();
//
//        for (int i = 2; i<max; i++) {
//            if (isprime(i))
//
//                System.out.printf("%d,", i);
//        }
//        long end = System.currentTimeMillis();
//        //System.out.println(end - start);
//    }
//
//}

/*
因为t<100,reference fastTable prime
 */
public class J1137 {

    static Scanner cin = new Scanner(System.in);
    static int[] t = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53};

    public static void main(String[] args) {
        int t = cin.nextInt();
        int m = cin.nextInt();
        int[] b = new int[m];
        int[][] list = new int[m][16];
        for (int i = 0; i < m; i++) {
            b[i]=cin.nextInt();
        }
        for(int i=0;i<m;i++){
            int rc=b[i];
            for(int x=0;x<16;x++){
                while(rc%x==0){
                    list[i][x]++;
                    rc/=x;
                }
            }
        }
    }
}
