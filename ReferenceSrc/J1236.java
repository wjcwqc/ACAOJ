import java.util.Scanner;

public class J1236 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while(cn.hasNext()){
            int n = cn.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = cn.nextInt();
            }
            for(int i =0;i<n-1;i++){
                a[i+1]=low(a[i],a[i+1]);
            }
            System.out.println(a[n-1]);
        }
    }
    private static int gcd(int i, int j){
        return i>0? gcd(j%i,i):j;
    }

    private static int low(int i, int j) {
        return (i*j)/gcd(i,j);
    }

}