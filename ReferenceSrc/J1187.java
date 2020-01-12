import java.util.Scanner;

public class J1187{
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while(cn.hasNext()){
            int a1 = cn.nextInt();
            int a2 = cn.nextInt();
            int b1 = cn.nextInt();
            int b2 = cn.nextInt();

            int i = 1;
            while(i%a1!=a2||i%b1!=b2){//进行循环判断
                i++;
            }
            System.out.println(i);
        }
        cn.close();
    }
}