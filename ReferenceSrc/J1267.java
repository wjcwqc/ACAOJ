import java.util.Scanner;

public class J1267 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()) {
            String str = cn.nextLine();
            if (str.equals("END"))
                return;
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 'A' || ch[i] == 'W' || ch[i] == 'F')
                    ch[i] = 'I';
                else if (ch[i] == 'C')
                    ch[i] = 'L';
                else if (ch[i] == 'M')
                    ch[i] = 'o';
                else if (ch[i] == 'S')
                    ch[i] = 'v';
                else if (ch[i] == 'D' || ch[i] == 'P' || ch[i] == 'G'
                        || ch[i] == 'B')
                    ch[i] = 'e';
                else if (ch[i] == 'L')
                    ch[i] = 'Y';
                else if (ch[i] == 'X')
                    ch[i] = 'u';
            }
            System.out.println(ch);
        }
    }
}