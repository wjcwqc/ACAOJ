import java.util.Scanner;

import static java.lang.Math.max;

public class J1253 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            int a = cin.nextInt();
            int b = cin.nextInt();
            int max =0;
            for(int i = a;i<=b;i++){
                max = max(cnt(i),max);
            }
            System.out.println(a+" "+b+" "+max);
        }
    }
    public static int cnt(int a){
        int cnt = 0;
        while (true) {
            a = jiaogu(a);
            cnt++;
            if (a == 0) {
                break;
            }
        }
        return cnt;
    }
    public static int jiaogu(int a){
        if(a%2==0){
            a = a/2;
        }else if(a!=1){
            a = 3*a+1;
        }else {
            a = 0;
        }
        return a;
    }
}
