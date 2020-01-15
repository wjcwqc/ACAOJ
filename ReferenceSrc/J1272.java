import java.util.Scanner;

public class J1272 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int a = cn.nextInt();
        System.out.println(back(a));
    }

    private static int back(int a) {
        int s = 0;
        while(a>0){
            s = s*10 + a%10;
            a/=10;
        }
        return s;
    }
}