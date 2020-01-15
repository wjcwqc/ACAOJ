import java.util.Scanner;

public class J1295 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while(cn.hasNext()){
            int n = cn.nextInt();
            double sum = 0;
            for(int i = 1;i<= n;i++){
                sum += 1.0/i;
            }
            System.out.printf("%.3f\n",sum);
        }
    }
}