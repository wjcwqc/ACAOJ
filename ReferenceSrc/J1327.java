import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class J1327 {
    public static void main(String[] args) {
        String str;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            while ((str = in.readLine()) != null) {
                Evaluator ev = new Evaluator(str);
                System.out.println(ev.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Evaluator {
    private static final int EOL = 0;
    private static final int VALUE = 1;
    private static final int OPAREN = 2;
    private static final int CPAREN = 3;
    private static final int EXP = 4;
    private static final int MULT = 5;
    private static final int DIV = 6;
    private static final int PLUS = 7;
    private static final int MINUS = 8;

    private static class Precendence {
        public int inputSymbol;
        public int topOfStack;

        public Precendence(int inSymbol, int topSymbol) {
            inputSymbol = inSymbol;
            topOfStack = topSymbol;
        }
    }

    private static Precendence[] precTable = {new Precendence(0, -1),
            new Precendence(0, 0), new Precendence(100, 0),
            new Precendence(0, 99), new Precendence(6, 5),
            new Precendence(3, 4), new Precendence(3, 4),
            new Precendence(1, 2), new Precendence(1, 2)};

    private static class Token {
        public Token() {
            this(EOL);
        }

        public Token(int t) {
            this(t, 0);
        }

        public Token(int t, long v) {
            type = t;
            value = v;
        }

        public int getType() {
            return type;
        }

        public long getValue() {
            return value;
        }

        private int type = EOL;
        private long value = 0;
    }

    private static class EvalTokenizer {
        public EvalTokenizer(StringTokenizer is) {
            str = is;
        }

        public Token getToken() {
            long theValue;
            if (!str.hasMoreTokens())
                return new Token();
            String s = str.nextToken();
            if (s.equals(" "))
                return getToken();
            if (s.equals("^"))
                return new Token(EXP);
            if (s.equals("/"))
                return new Token(DIV);
            if (s.equals("*"))
                return new Token(MULT);
            if (s.equals("("))
                return new Token(OPAREN);
            if (s.equals(")"))
                return new Token(CPAREN);
            if (s.equals("+"))
                return new Token(PLUS);
            if (s.equals("-"))
                return new Token(MINUS);
            try {
                theValue = Long.parseLong(s);
            } catch (NumberFormatException e) {
                System.out.println("Parse error");
                return new Token();
            }
            return new Token(VALUE, theValue);
        }

        private StringTokenizer str;

    }

    public Evaluator(String s) {
        opStack = new Stack<Integer>();
        opStack.push(EOL);
        postfixStack = new Stack<Long>();
        str = new StringTokenizer(s, "+*-/^()", true);
    }

    public long getValue() {
        EvalTokenizer tok = new EvalTokenizer(str);
        Token lastToken;
        do {
            lastToken = tok.getToken();
            processToken(lastToken);
        } while (lastToken.getType() != EOL);
        if (postfixStack.isEmpty()) {
            System.out.println("Missing operand!");
            return 0;
        }
        long thResult = postfixStack.pop();
        if (!postfixStack.isEmpty())
            System.out.println("Warning:missing operators!");
        return thResult;
    }

    private Stack<Integer> opStack;
    private Stack<Long> postfixStack;
    private StringTokenizer str;

    private void processToken(Token lastToken) {
        int topOp;
        int lastType = lastToken.getType();
        switch (lastType) {
            case VALUE:
                postfixStack.push(lastToken.getValue());
                return;
            case CPAREN:
                while ((topOp = opStack.peek()) != OPAREN && topOp != EOL)
                    binaryOp(topOp);
                if (topOp == OPAREN)
                    opStack.pop();
                else
                    System.out.println("Missing open parenthesis");
                break;
            default:
                while (precTable[lastType].inputSymbol <= precTable[topOp = opStack
                        .peek()].topOfStack)
                    binaryOp(topOp);
                if (lastType != EOL)
                    opStack.push(lastType);
                break;
        }
    }

    private long postfixPop() {
        if (postfixStack.isEmpty()) {
            System.out.println("Missing operand");
            return 0;
        }
        return postfixStack.pop();
    }

    private void binaryOp(int topOp) {
        if (topOp == OPAREN) {
            System.out.println("Unbalanced parentheses");
            opStack.pop();
            return;
        }
        long rhs = postfixPop();
        long lhs = postfixPop();
        if (topOp == EXP)
            postfixStack.push((long) Math.pow(lhs, rhs));
        else if (topOp == PLUS)
            postfixStack.push(lhs + rhs);
        else if (topOp == MINUS)
            postfixStack.push(lhs - rhs);
        else if (topOp == MULT)
            postfixStack.push(lhs * rhs);
        else if (topOp == DIV)
            if (rhs != 0)
                postfixStack.push(lhs / rhs);
            else {
                System.out.println("Division by zero");
                postfixStack.push(lhs);
            }
        opStack.pop();
    }

}