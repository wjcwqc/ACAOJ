import java.util.*;
public class Problem_1493 {
    static void function(int n,int m,int a,int b){
        boolean flag=true;
        while(a!=m){
            if(sushu(b++)){
                flag=false;
            }
            if(flag){
                a=a%n+1;
            }
            else{
                a=(a+n-1)%n;
            }
        }
        judge(b);
    }
    static boolean sushu(int n){
        boolean flag=true;
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
    static void judge(int b){
        if(sushu(b)){
            System.out.println("duang");
        }
        else{
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t=cin.nextInt();
        for(int i=1;i<=t;i++) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            int a = cin.nextInt();
            int b = cin.nextInt();
            function(n, m, a, b);
        }
        cin.close();
    }
}
