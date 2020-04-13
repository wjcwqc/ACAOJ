import java.util.Arrays;
import java.util.Scanner;

public class J1546b {

    private static String[] table = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String str = cin.nextLine();
            System.out.println(sum(str));
            if (sum(str) == 0) return;
        }
    }

    private static int sum(String str) {
        String s1 = str.substring(0, str.indexOf("+") - 1);
        String s2 = str.substring(str.indexOf("+") + 2, str.indexOf("=") - 1);
        String[] arr1 = s1.split("\\s+");
        String[] arr2 = s2.split("\\s+");
        int a = 0, b = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (arr1[i].equals(table[j])) {
                    a += j * Math.pow(10, arr1.length - i - 1);
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (arr2[i].equals(table[j])) {
                    a += j * Math.pow(10, arr1.length - i - 1);
                }
            }
        }
        return a + b;
    }
}
