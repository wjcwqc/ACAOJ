import java.util.Scanner;

public class Problem_1582 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        StringBuffer sbf = new StringBuffer("");
        StringBuffer newsbf = new StringBuffer("");
        int n = cin.nextInt();
        for (int i = 0; i < n; i++) {
            sbf.append(cin.nextInt());
        }
        int x = 0;
        while (sbf.length() != 0) {
            if (sbf.length() == 1) {
                newsbf.append(sbf);
                break;
            }
            if (x == 0) {
                char temp = sbf.charAt(0);
                newsbf.append(temp);
                sbf.deleteCharAt(0);
                x = 1;
            }
            if (x == 1) {
                char temp = sbf.charAt(0);
                sbf.deleteCharAt(0);
                sbf.append(temp);
                x = 0;
            }
        }
        char[] arr = newsbf.toString().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
