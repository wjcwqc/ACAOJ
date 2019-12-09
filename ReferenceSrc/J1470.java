import java.util.*;

public class J1470 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()) {
            Stack<Character> stack = new Stack<>();
            String str = cin.nextLine();
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= 'a' && ch[i] <= 'z') {
                    stack.push(ch[i]);
                } else {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.peek());
                        stack.pop();
                    }
                    System.out.print(ch[i]);
                }
            }
            System.out.println();
        }
        cin.close();
    }
}
