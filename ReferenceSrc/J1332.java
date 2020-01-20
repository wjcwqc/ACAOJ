import java.util.Scanner;

public class J1332 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while(cn.hasNext()){
            int a = cn.nextInt();
            int b = cn.nextInt();
            int i =2;
            int jc = a;
            while(i<=b){
                jc*=a;
                jc%=1000;
                i++;
            }
            if(jc<10){
                System.out.println("00"+jc);
            }
            else if(jc<100){
                System.out.println("0"+jc);
            }
            else System.out.println(jc);
        }
    }
}