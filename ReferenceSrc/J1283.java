import java.util.Scanner;

public class J1283 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int a = cn.nextInt();
        int b = cn.nextInt();
        int c = cn.nextInt();
        int min = Math.min(a, b);
        min = Math.min(min, c);
        int max = Math.max(a, b);
        max = Math.max(max, c);
        int mid = a+b+c-min-max;
        if(min*min+mid*mid==max*max){
            System.out.println("yes");
        }
        else if(min+mid>max) {
            System.out.println("no");
        }
        else System.out.println("not a triangle");
    }
}