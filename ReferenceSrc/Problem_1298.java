import java.math.BigDecimal;
import java.util.Scanner;

public class Problem_1298 {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        while(cin.hasNext()){
            BigDecimal a=cin.nextBigDecimal();
            BigDecimal b=cin.nextBigDecimal();
            int c=cin.nextInt();
            BigDecimal r=a.remainder(b);
            System.out.println(a.divide(b,c,BigDecimal.ROUND_UP));
        }
    }
}
