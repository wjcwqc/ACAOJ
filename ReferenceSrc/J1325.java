import java.util.Scanner;

public class J1325 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()) {
            int n = cn.nextInt();
            System.out.println(backk(n));
        }
    }

    private static StringBuffer backk(int n) {
        StringBuffer sb = new StringBuffer(String.valueOf((char) (n+64)));
        return n<= 1?sb: backk(n-1).append(sb).append(backk(n-1));
    }
}