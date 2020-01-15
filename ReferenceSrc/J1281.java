import java.util.Scanner;

public class J1281 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        double sum = n*95;
        if(sum>=300){
            sum = sum*0.85;
        }
        System.out.printf("%.2f\n",sum);
    }
}