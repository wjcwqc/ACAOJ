import java.util.Scanner;

public class J1175 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while(cn.hasNext()){
            int a = cn.nextInt();
            int b = cn.nextInt();
            if(a==0&&b==0) break;
            System.out.println(Sum(a,b));
        }
    }

    private static int Sum(int a, int b) {
        int sum = 0;
        for(int i =a;i<=b;i++){
            sum+=i;
        }
        return sum;
    }
}