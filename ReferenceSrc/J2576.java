import java.util.*;
import java.math.BigInteger;

public class J2576 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            int n=cin.nextInt();
            int m=cin.nextInt();
            int a=cin.nextInt();
            BigInteger b=BigInteger.valueOf(1);
            b=b.multiply(BigInteger.valueOf(n/a));
            b=b.multiply(BigInteger.valueOf(m/a));
            System.out.println(b);
        }
        cin.close();
    }
}
