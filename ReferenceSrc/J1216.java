import java.util.Scanner;

public class J1216 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        Sttt(n);
    }
    //进行循环递归输出
    public static int Sttt(int n){
        if(n<2&&n>=1){
            System.out.println(1);
            return 1;
        }
        else if(n>=2&&n<5){
            int t = n/2;
            while(t-->0){
                System.out.println(2);
            }
            int z =n%2;
            return Sttt(z);
        }
        else if(n>=5&&n<10){
            int t = n/5;
            while(t-->0){
                System.out.println(5);
            }
            int z =n%5;
            return Sttt(z);
        }
        else if(n>=10&&n<20){
            int t = n/10;
            while(t-->0){
                System.out.println(10);
            }
            int z =n%10;
            return Sttt(z);
        }
        else if(n>=20&&n<50){
            int t = n/20;
            while(t-->0){
                System.out.println(20);
            }
            int z =n%20;
            return Sttt(z);
        }
        else if(n>=50&&n<100){
            int t = n/50;
            while(t-->0){
                System.out.println(50);
            }
            int z =n%50;
            return Sttt(z);
        }
        else if(n>=100){
            int t = n/100;
            while(t-->0){
                System.out.println(100);
            }
            int z =n%100;
            return Sttt(z);
        }
        else return 0;

    }
}
