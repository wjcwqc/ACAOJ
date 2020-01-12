import java.util.Scanner;

public class J1167 {
    private static final String[] NUMBERS = {"零", "壹", "贰", "叁", "肆",
            "伍", "陆", "柒", "捌", "玖"};
    private static final String[] IUNIT = {"元", "拾", "佰", "仟", "万",
            "拾", "佰", "仟", "亿", "拾", "佰", "仟", "万", "拾", "佰", "仟"};
    private static final String[] DUNIT = {"角", "分", "厘"};

    private static String toChinese(String str) {
        if ("0".equals(str) || "0.00".equals(str) || "0.0".equals(str)) {
            return "零元";
        }
        if ("10".equals(str)) return "拾元整";
        boolean flag = false;
        if (str.startsWith("-")) {
            flag = true;
            str = str.replace("-", "");
        }
        str = str.replace(",", "");
        String integerStr;
        String decimalStr;

        if (str.indexOf(".") > 0) {
            integerStr = str.substring(0, str.indexOf("."));
            decimalStr = str.substring(str.indexOf(".") + 1);
        } else if (str.indexOf(".") == 0) {
            integerStr = "";
            decimalStr = str.substring(1);
        } else {
            integerStr = str;
            decimalStr = "";
        }

        int[] integers = toIntArray(integerStr);

        if (integers.length > 1 && integers[0] == 0) {
            if (flag) str = "-" + str;
            return str;
        }
        boolean isWan = isWan5(integerStr);
        int[] decimals = toIntArray(decimalStr);
        String result = getChineseInteger(integers, isWan) + getChineseDecimal(decimals);
        if (flag) return "负" + result;
        else if (!str.contains(".")) {
            return result + "整";
        } else return result;
    }

    private static int[] toIntArray(String number) {
        int[] arr = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            arr[i] = Integer.parseInt(number.substring(i, i + 1));
        }
        return arr;
    }

    private static String getChineseInteger(int[] integers, boolean isWan) {
        StringBuilder sb = new StringBuilder();
        int length = integers.length;
        if (length == 1 && integers[0] == 0) {
            return "";
        }
        for (int i = 0; i < length; i++) {
            String key = "";
            if (integers[i] == 0) {
                if (length - i == 13) key = IUNIT[4];
                else if (length - i == 9) key = IUNIT[8];
                else if (length - i == 5 && isWan) key = IUNIT[4];
                else if (length - i == 1) key = IUNIT[0];
                if (length - i > 1 && integers[i + 1] != 0) {
                    key += NUMBERS[0];
                }
            }
            sb.append(integers[i] == 0 ? key : (NUMBERS[integers[i]] + IUNIT[length - i - 1]));
        }
        return sb.toString();
    }

    private static String getChineseDecimal(int[] decimals) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < decimals.length; i++) {
            if (i == 3) break;
            sb.append(decimals[i] == 0 ? "" : (NUMBERS[decimals[i]] + DUNIT[i]));
        }
        return sb.toString();
    }

    private static boolean isWan5(String integerStr) {
        int length = integerStr.length();
        if (length > 4) {
            String subInteger;
            if (length > 8) {
                subInteger = integerStr.substring(length - 8, length - 4);
            } else {
                subInteger = integerStr.substring(0, length - 1);
            }
            return Integer.parseInt(subInteger) > 0;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String s = cin.next();
            System.out.println(toChinese(s));
        }
        cin.close();
    }
}
