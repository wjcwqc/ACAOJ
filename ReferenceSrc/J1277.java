import java.util.Scanner;

public class J1277 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int  n = cn.nextInt();
        int sum = 0;
        for(int i =1;i<=n;i++){
            sum+= i;
        }
        System.out.println(sum);
    }
}