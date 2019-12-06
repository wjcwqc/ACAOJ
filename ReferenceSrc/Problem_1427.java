import java.util.*;

public class Problem_1427 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        while(n-->0){
            int a=cin.nextInt();
            int b=cin.nextInt();
            int c=cin.nextInt();
            int d=cin.nextInt();
            int e=c*d-a*b;
            System.out.println(Math.abs(e));
        }
        cin.close();
    }
}
