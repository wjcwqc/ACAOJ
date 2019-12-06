import java.util.Scanner;

public class Problem_1060 {
    public static void main(String args[]){
        Scanner cin=new Scanner(System.in);
        int n;
        int[] a=new int[100];
        while(cin.hasNext()){
            n=cin.nextInt();
            if(n==0)
                break;
            //int a[]=new int[100];
            for(int i=0;i<n;i++)
                a[i]=cin.nextInt();
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(Math.abs(a[i])<Math.abs(a[j])){
                        int x=a[j];
                        a[j]=a[i];
                        a[i]=x;
                    }
                }
            }
            for(int i=0;i<n;i++){
                if(i==0)
                    System.out.print(a[i]);
                else
                    System.out.print(" "+a[i]);
            }
            System.out.println();

        }
    }
}
