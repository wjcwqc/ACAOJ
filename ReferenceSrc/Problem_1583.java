import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Problem_1583 {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            String s = cin.nextLine();
            if (isMatch(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean isMatch(String s) {
        Map<Character, Character> bracket = new HashMap<>();
        bracket.put(')', '(');
        bracket.put(']', '[');
        bracket.put('}', '{');

        Stack stack = new Stack();

        for (int i = 0; i < s.length(); i++) {

            Character temp = s.charAt(i);
            if (bracket.containsValue(temp)) {
                stack.push(temp);
            } else if (bracket.containsKey(temp)) {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() == bracket.get(temp)) {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }
        return stack.isEmpty() ? true : false;

    }
}
