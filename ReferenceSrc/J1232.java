import java.util.Arrays;
import java.util.Scanner;

public class J1232 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while(cn.hasNext()){
            int n = cn.nextInt();
            int[] a = new int[n];
            int as =0;
            for(int i =0;i<n;i++){
                a[i] = cn.nextInt();
                as +=a[i];
            }
            Arrays.sort(a);
            as -= a[0]+a[a.length-1];
            double aaa = 1.0*as/(n-2);
            System.out.printf("%.2f\n",aaa);
        }
    }
}