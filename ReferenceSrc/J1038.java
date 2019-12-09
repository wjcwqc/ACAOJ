import java.util.Scanner;

public class J1038 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a=cin.nextInt();
        while(true){
            a=jiaogu(a);
            if(a==0){
                break;
            }
        }
    }
    public static int jiaogu(int a){
        int rst;
        if(a%2==0){
            rst = a/2;
            System.out.printf("%d/2=%d\n",a,rst);
        }else if(a!=1){
            rst = 3*a+1;
            System.out.printf("%d*3+1=%d\n",a,rst);
        }else{
            rst=0;
        }
        return rst;
    }
}
