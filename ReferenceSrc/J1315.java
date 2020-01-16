import java.util.Scanner;

public class J1315 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int t = cn.nextInt();
        while (t-- > 0) {
            String str = cn.next();
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length;) {
                int count = 0;
                int j = i;
                while (j < ch.length) {//进行循环寻找对应的字符重复的次数
                    if (ch[i] == ch[j]) {
                        count++;
                        j++;
                    } else {
                        break;
                    }
                }
                i = j;//将i对应的序号转换到，下一个判断的字符
                System.out.print(count+""+ch[i-1]);
            }
            System.out.println();
        }
    }
}