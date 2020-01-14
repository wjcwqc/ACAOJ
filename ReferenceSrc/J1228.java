import java.math.BigInteger;
import java.util.Scanner;


public class J1228 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int a=cin.nextInt();
        System.out.println(factorial(a));
    }

    private static BigInteger factorial(int a) {
        return a==0? new BigInteger("1"):factorial(a-1).multiply(new BigInteger(Integer.toString(a)));
    }
}