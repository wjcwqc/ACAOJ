import java.util.Arrays;
import java.util.Scanner;

public class Problem_1159 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            int n=cin.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=cin.nextInt();

            }
            Arrays.sort(a);
            double sum=0;
            for(int i = 1;i<n-1;i++){
                sum+=a[i];
            }
            sum/=(n-2);
            System.out.printf("%.2f\n",sum);
        }


        cin.close();
    }
}
