import java.util.Scanner;

public class Problem_1332 {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int a,b;
        while (cin.hasNext()) {
            a = cin.nextInt();
            b = cin.nextInt();
            if (a % 1000 == 0 || a % 1000 == 1) {
                a = a % 1000;
            } else {
                a = mi(a, b);
            }

            System.out.println(String.format("%03d", a));
        }
    }

    private static int mi(int a, int b) {
        a=a%1000;
        int t=a;
        if(b>1){
            t=mi(a*a,b/2);
            if(b%2==1){
                t =t*a % 1000;
            }else{
                t=t%1000;
            }
        }

        return t;
    }
}
