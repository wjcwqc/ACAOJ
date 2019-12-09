import java.util.Scanner;

public class J1213 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int cnt = 0;
            if(ch(n)){
                System.out.println("Unlucky");
            }else {
                for (int i = 1; i <= n; i++) {
                    if (ch(i)) {
                        continue;
                    }
                    cnt++;
                }
                System.out.println(cnt);
            }
        }
    }

    public static boolean ch(int a) {
        boolean rst = false;
        if(a/10!=0&&a%10==0){
            rst = true;
        }else if(a/10!=0){
            rst = ch(a/10);
        }
        return rst;
    }
}
