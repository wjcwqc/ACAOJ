
import java.util.*;
import java.math.BigInteger;

public class J2574 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            int a=cin.nextInt();
            int b=cin.nextInt();
            BigInteger c=BigInteger.valueOf(1);
            for(int i=1;i<=b;i++){
                c=c.multiply(BigInteger.valueOf(a));
            }
            String str=c.toString();
            System.out.println(str.charAt(str.length()-1));
        }
        cin.close();
    }
}
