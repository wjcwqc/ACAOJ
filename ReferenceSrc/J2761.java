import java.util.Arrays;
import java.util.Scanner;

public class J2761 {
    private static int N = 100;
    private static long[] H = new long[N+1];


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        solve();
    }

    private static void solve() {
        for (int i = 0; i <= N; i++) {
            H[i] = 1L * i*i*i*i*i;
        }
        for (int e = 1; e < N; e++) {
            for (int d = 1; d<= e ; d++) {
                for (int c = 1; c <= d; c++) {
                    for (int b = 1; b <= c; b++) {
                        for (int a = 1; a <= b; a++) {
                            long key = H[a]+H[b]+H[c]+H[d]+H[e];
                            int f = Arrays.binarySearch(H,e,N,key);
                            if(f>=0){
                                System.out.println(String.format("%d %d %d %d %d %d",a,b,c,d,e,f));
                            }
                        }
                    }
                }
            }
        }
    }
}
