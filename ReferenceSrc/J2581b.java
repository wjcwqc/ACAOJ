import java.util.Scanner;

public class J2581b {
    static String[] str;
    static int i = -1;

    public static void main(String[] args) {
        str = new String[20]; // 字符数组
        Scanner input = new Scanner(System.in);
        str = input.nextLine().split(" ");
        input.close();
        System.out.printf("%.2f", exp());
    }

    private static double exp() {
        i++;
        switch (str[i]) {
            case "+":
                return exp() + exp();
            case "-":
                return exp() - exp();
            case "*":
                return exp() * exp();
            case "/":
                return exp() / exp();
            default:
                return Double.parseDouble(str[i]);
        }
    }

}
