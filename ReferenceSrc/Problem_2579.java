import java.util.Scanner;
import java.util.Stack;

public class Problem_2579 {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        String exp[] = cin.nextLine().split("\\s");
        Stack<Double> S = new Stack<>();
        for (String s : exp) {
            if (s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")) {
                double b = S.peek();
                S.pop();
                double a = S.peek();
                S.pop();
                switch (s.charAt(0)) {
                    case '+':
                        S.push(a + b);
                        break;
                    case '*':
                        S.push(a * b);
                        break;
                    case '-':
                        S.push(a - b);
                        break;
                    case '/':
                        S.push(a / b);
                        break;
                }
            } else {
                S.push(Double.parseDouble(s));
            }

        }
        System.out.printf("%.2f", S.peek());
    }

}
