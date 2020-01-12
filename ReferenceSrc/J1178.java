import java.util.Arrays;
import java.util.Scanner;

public class J1178 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        while (n-- > 0) {

            int m = cn.nextInt();
            int[] a = new int[m];
            for(int i =0;i<m;i++){
                a[i] = cn.nextInt();
            }
            Arrays.sort(a);
            int lis = a[0]-a[1];
            boolean flag = true;
            for(int i=0;i<m-1;i++){
                if(a[i]-a[i+1]!=lis) flag = false;
            }
            if(flag) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
