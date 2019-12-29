import java.util.Scanner;

public class J1037 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        //TODO
        long ans = 0;
        for(int i = 0; i < 64; i++){
            ans += Math.pow(2,i);
        }
        System.out.println(ans);
        cin.close();
    }
}
