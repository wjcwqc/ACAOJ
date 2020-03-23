import java.math.BigInteger;
import java.util.*;

public class J2278 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(Fibonacci(n));
        cin.close();
    }

    private static BigInteger Fibonacci(int n) {
        BigInteger a1=new BigInteger("1");
        BigInteger a2=new BigInteger("2");
        BigInteger a3=new BigInteger(n+"");
        for(int i=3;i<=n;i++) {
            a3 = a1.add(a2);
            a1=a2;
            a2=a3;
        }
        return a3;
    }
}
