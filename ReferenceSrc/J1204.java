import java.util.Scanner;
import java.util.Stack;

public class J1204 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int t = cn.nextInt();
        Stack<Character> sta = null;
        while (t-- > 0) {
            String str = cn.next();
            if (str.length() % 2 == 1)
                System.out.println("No");
            else {
                sta = new Stack<Character>();
                for (int i = 0; i < str.length(); i++) {
                    //是空的就入栈
                    if (sta.isEmpty())
                        sta.push(str.charAt(i));
                        //有匹配的就出栈
                    else if (sta.peek() == '[' && str.charAt(i) == ']'
                            || sta.peek() == '(' && str.charAt(i) == ')'
                            || sta.peek() == '{' && str.charAt(i) == '}')
                        sta.pop();
                        //不匹配的也入栈
                    else
                        sta.push(str.charAt(i));

                }
                if (sta.isEmpty())
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
        cn.close();
    }
}