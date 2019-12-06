
import java.util.Scanner;

public class Problem_1041 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n =cin.nextInt();
        double sum = 0.0;
        for(int i=1;i<=n;i++){
            sum =sum+ 1.0/i;
        }
        System.out.printf("%.6f",sum);
    }
}
