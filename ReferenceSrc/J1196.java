import java.util.Scanner;

public class J1196 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()) {
            int n = cn.nextInt();
            int m = cn.nextInt();
            int k = cn.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = j + 1;
            }
            int i = 0, len = n, count = 1;

            while (len > k) {
                if (a[i % n] > 0) {
                    if (count % m == 0) {
                        a[i % n] = -1;
                        len--;
                        count = 1;
                        i++;
                    } else {
                        i++;
                        count++;
                    }
                } else {
                    i++;
                }
            }
            int t = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] > 0) {
                    t++;
                }
            }
            int z =0;
            for(int j =0;j<n;j++){
                if(a[j]>0&&z<t-1){
                    z++;
                    System.out.print(a[j]+" ");
                }
                else if(a[j]>0){
                    System.out.println(a[j]);
                }
            }
        }
    }
}