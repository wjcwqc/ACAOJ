import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @author MWD
 * @date 2020年6月30日 0030 15:24
 */
public class J3197b {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int kg = cin.nextInt();
        double m = cin.nextDouble();
        double N = kg * 1.0 / (m * m);

        BigDecimal b = new BigDecimal(N);
        double f1 = b.setScale(1, RoundingMode.HALF_UP).doubleValue();
        biaozhun(N);
        System.out.println(String.format("%.1f %s",f1,biaozhun(N)));

    }

    private static String biaozhun(double n) {
        if (n<18.5){
            return "L";
            //18.5-24
        }else if (n>=18.5&&n<=24){
            return "N";
        }else{
            return "H";
        }
    }
}
