import java.util.Scanner;

public class Problem_1115 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a=cin.nextInt();
        for(int i=1;i<=a;i++){
            d(i);
        }
        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i]);
        }
    }
    public static int[] n=new int[10];
    public static void d(int a){
        for(;a>0;a/=10){
            n[a%10]++;
        }
    }
}
