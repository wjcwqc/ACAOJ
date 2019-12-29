import java.util.Scanner;

public class J1036 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        //TODO
        int n = cin.nextInt();
        double ans = 100.0;
        double height = 100.0;
        if(n == 1)
            ans = 100.0;
        for(int i = 2; i <= n; i++){
            ans += height;
            height /= 2;
        }
        System.out.printf("%.4f",ans);
        cin.close();
    }
}
