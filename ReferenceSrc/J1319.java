import java.util.Scanner;

public class J1319 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int t = cn.nextInt();
        while (t-- > 0) {
            String str1 = cn.next();
            String str2 = cn.next();
            StringBuffer str11 = uniq(str1);
            StringBuffer str22 = uniq(str2);
            String str111 = str11.toString();
            String str222 = str22.toString();
            if (str111.equals(str222))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
    //去重函数
    private static StringBuffer uniq(String str1) {
        char[] ch = str1.toCharArray();
        StringBuffer str = new StringBuffer("");
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '#')
                continue;
            str.append(ch[i]);
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[j] == '#')
                    continue;
                if (ch[i] == ch[j]) {
                    ch[j] = '#';
                }
            }
        }
        return str;
    }
}