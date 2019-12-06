import java.math.BigInteger;
import java.util.Scanner;

public class Problem_1177 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while (cin.hasNext()){
             int n=cin.nextInt();
            BigInteger p=BigInteger.valueOf(1);
            for(int i=1;i<=n;i++){
                p=p.multiply(BigInteger.valueOf(i));
            }
            System.out.println(p);
        }
    }
}
