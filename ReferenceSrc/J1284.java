import java.util.Scanner;

public class J1284 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        if(n%4==0&&n%100!=0||n%400==0)
            System.out.println("yes");
        else System.out.println("no");
    }
}