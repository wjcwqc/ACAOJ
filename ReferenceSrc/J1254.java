import java.util.Scanner;

public class J1254 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int t= cn.nextInt();
        while(t-->0){
            int n = cn.nextInt();
            int z = n,count =0;
            while(z>0){
                z/=10;
                count++;
            }
            int m = (int) Math.pow(10, count-1);
            int ans = n%m;
            System.out.println(ans);
        }
    }
}