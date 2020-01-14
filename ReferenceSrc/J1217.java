import java.util.ArrayList;
import java.util.Scanner;

public class J1217 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        String str = cn.nextLine();
        boolean flag = false;//这道题目的测试数据，有的有可能空格，有的没有空格，好坑人啊
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                flag = true;
        }
        if (flag) {
            String[] ss = str.split(" ");
            if (ss[1].equals("+")) {
                addBinary(ss[0], ss[2]);
            }
            if (ss[1].equals("-")) {
                subBinary(ss[0], ss[2]);
            }
        } else {
            String str1 = "";
            String str2 = "";
            char ch = 0;
            int j = 0;
            for (; j < str.length(); j++) {
                if (Character.isDigit(str.charAt(j)))
                    continue;
                else {
                    ch = str.charAt(j);
                    break;
                }
            }

            str1 = str.substring(0, j);
            str2 = str.substring(j + 1, str.length());

            if (ch == '+') {
                addBinary(str1, str2);
            }
            if (ch == '-') {
                subBinary(str1, str2);
            }
        }
        cn.close();
    }

    private static void subBinary(String str1, String str2) {
        int aLength = str1.length();
        int bLength = str2.length();
        String result = "";
        ArrayList<Integer> aList = new ArrayList<Integer>();
        ArrayList<Integer> bList = new ArrayList<Integer>();

        for (int i = 0; i < aLength; i++) {
            aList.add(0, Integer.parseInt(str1.substring(i, i + 1)));
        }
        for (int i = 0; i < bLength; i++) {
            bList.add(0, Integer.parseInt(str2.substring(i, i + 1)));
        }

        int j = 0;
        int flag = 0;
        while (j < bLength) {
            int a1 = aList.get(j);
            int b1 = bList.get(j);
            int sum = 0;
            if (a1 - flag >= b1) {
                sum = a1 - b1 - flag;
                flag = 0;
            } else {
                sum = 2 - b1 - flag;
                flag = 1;
            }
            result = String.valueOf(sum) + result;
            j++;
        }
        if (j < aLength) {
            int a2 = aList.get(j);
            int sum = a2 - flag;
            result = String.valueOf(sum) + result;
            j++;
        }
        while (j < aLength) {
            int a3 = aList.get(j);
            result = String.valueOf(a3) + result;
            j++;
        }
        boolean fff = false;
        for (int k = 0; k < result.length(); k++) {
            if (result.charAt(k) == '1') {
                fff = true;
            }
            if (fff) {
                System.out.print(result.charAt(k));
            }
        }
        System.out.println();

    }

    private static void addBinary(String str1, String str2) {
        int aLength = str1.length();
        int bLength = str2.length();
        String result = "";
        ArrayList<Integer> aList = new ArrayList<Integer>();
        ArrayList<Integer> bList = new ArrayList<Integer>();

        for (int i = 0; i < aLength; i++) {
            aList.add(0, Integer.parseInt(str1.substring(i, i + 1)));
        }
        for (int i = 0; i < bLength; i++) {
            bList.add(0, Integer.parseInt(str2.substring(i, i + 1)));
        }

        int j = 0;
        int flag = 0;
        while (j < bLength) {
            int a1 = aList.get(j);
            int b1 = bList.get(j);

            int sum = a1 + b1 + flag;
            if (sum >= 2) {
                sum = sum % 2;
                result = String.valueOf(sum) + result;
                flag = 1;
            } else {
                result = String.valueOf(sum) + result;
                flag = 0;
            }
            j++;
        }
        while (j < aLength) {
            int a2 = aList.get(j);
            int sum = a2 + flag;
            if (sum >= 2) {
                sum = sum % 2;
                result = String.valueOf(sum) + result;
                flag = 1;
            } else {
                result = String.valueOf(sum) + result;
                flag = 0;
            }
            j++;
        }

        if (flag == 1) {
            result = String.valueOf(flag) + result;
        }
        System.out.println(result);
    }
}
