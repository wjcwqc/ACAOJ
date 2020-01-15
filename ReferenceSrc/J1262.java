import java.math.BigInteger;
import java.util.Scanner;

public class J1262 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while(cn.hasNext()){
            String str = cn.next();
            BigInteger big = new BigInteger(str);
            int count =0;
            while(big.compareTo(new BigInteger(Integer.toString(0)))==1){
                BigInteger big1 = big;
                BigInteger t = new BigInteger(Integer.toString(2));
                big = big.divide(t);
                if(big.multiply(t).compareTo(big1)!=0){
                    count++;
                }
            }
            if(count%2==0) System.out.println("even");
            else System.out.println("odd");
        }
    }
}