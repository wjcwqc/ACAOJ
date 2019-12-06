import java.util.*;

public class Problem_1487 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            int n=cin.nextInt();
            int  a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=cin.nextInt();
            }
            if(n%2==0){
                System.out.printf("%.2f\n",1.0*(a[n/2-1]+a[n/2])/2);
            }
            else{
                System.out.printf("%.2f\n",1.0*a[(n-1)/2]);
            }
        }
        cin.close();
    }
}
