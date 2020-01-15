import java.util.Scanner;

public class J1252 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int t = cn.nextInt();
        while (t-- > 0) {
            String str = cn.next();
            char[] ch = str.toCharArray();
            int leng = 1;
            int j = 1;
            for (int i = 0; i < ch.length; i++) {
                int count = 1;
                for (j = leng; j < ch.length; j++) {
                    if (ch[j] == ch[i])
                        count++;
                    else
                        break;
                }
                if (count > 1)
                    System.out.print(count+""+ch[i]);
                else
                    System.out.print(ch[i]);
                leng = j+1;
                i = j-1;
            }
            System.out.println();
        }
    }
}