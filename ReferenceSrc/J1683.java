import java.util.Scanner;

public class J1683 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n + 1];
        String[] b = new String[n + 1];
        String y = "";
        int tmp = 0;
        for (int i = 0; i <= n; i++) {
            tmp = cin.nextInt();
            a[i] = Math.abs(tmp);
            if (tmp >= 0) {
                b[i] = "+";
            } else {
                b[i] = "-";
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) continue;
            if (!(i == 0 && b[i].equals("+")))
                y = y + b[i];

            if ( ! (a[i] == 1) || (a.length-1-i)==0) y = y + a[i];

            if((a.length-i-1) > 0) {
                y = y + "x";
                if((a.length-i-1) > 1){
                    y = y + "^" + (a.length-i-1);
                }
            }
        }
        System.out.println(y);
        cin.close();
    }
}
