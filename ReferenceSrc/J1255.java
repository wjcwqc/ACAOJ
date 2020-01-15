import java.util.Scanner;

public class J1255 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()) {
            String str = cn.next();
            char[] ch = str.toCharArray();
            int length = ch.length, j, k = 1;
            for (int i = 0; i < length;) {
                for (j = 1; j < length; j++) {
                    if (ch[i] == ch[j]) {
                        k = j - i;
                        i++;
                    } else
                        i = 0;
                }
                if(j>=length) break;
            }
            System.out.println(k);
        }
    }
}