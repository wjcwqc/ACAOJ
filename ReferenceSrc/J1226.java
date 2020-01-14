import java.util.Scanner;

public class J1226 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            fun(cin.nextLine());
        }
    }

    private static void fun(String str) {
        String[] arr = str.split(" ");
        char[] ch;
        String[] brr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ch = arr[i].toCharArray();
            if (ch[0]>='a' && ch[0]<='z') {
                ch[0] = (char) (ch[0] - 32);
            }
            brr[i] = "";
            for (char c : ch) {
                brr[i] += c;
            }
        }
        for (String x : brr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
