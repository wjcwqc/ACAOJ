import java.util.Scanner;

public class J1328 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        String str;
        while(cn.hasNext()){
            str = cn.nextLine();
            str = str.toLowerCase();
            char[] ch = str.toCharArray();
            if(ch[0]>='a'&&ch[0]<='z')
                ch[0] = (char) (ch[0]-32);
            System.out.println(ch);
        }
    }
}