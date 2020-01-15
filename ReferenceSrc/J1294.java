import java.util.Scanner;

public class J1294 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while(cn.hasNext()){
            int n = cn.nextInt();
            int[] a= new int[n];
            for(int i =0;i<n;i++){
                a[i] = cn.nextInt();
            }
            int m = cn.nextInt();
            int count = 0;
            for(int i=0;i<n;i++){
                if(a[i]<m) count++;
            }
            System.out.println(count);
        }
    }
}