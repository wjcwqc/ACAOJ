import java.util.Scanner;

public class J1263 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while(cn.hasNext()){
            int n = cn.nextInt();
            int i =0;
            int[] a = new int[1000];
            while(n>0){
                if(n%2==0) a[i] = 0;
                else a[i] = 1;
                n/=2;i++;
            }
            int sum = 0;
            for(int j = 0;j< i ;j++){
                sum += a[j]*Math.pow(2, i-j-1);
            }
            System.out.println(sum);
        }
    }
}