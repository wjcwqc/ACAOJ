import java.util.Scanner;

public class J1326 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        while(n-->0){
            int m = cn.nextInt();
            int sum = 2,i = 2;
            while(i<=m){
                sum += 9*(i-1)+1;
                i++;
            }
            System.out.println(sum);
        }
    }
}