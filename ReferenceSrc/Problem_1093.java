import java.util.Scanner;

import static java.lang.Math.max;

public class Problem_1093 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            int max = cin.nextInt();
            int now;
            while(true){
                now = cin.nextInt();
                if(now==0){
                    break;
                }
                max = max(max,now);
            }
            System.out.println(max+"\n");
        }
    }
}
