public class Problem_1031 {
    public static void main(String[] args) {
        String str, str1;
        for (int i = 95860; ; i++) {
            str = String.valueOf(i);
            str1 = str.substring(0, 2);
            StringBuilder str2 = new StringBuilder(str.substring(3, str.length()));
            if (str1.equals(str2.reverse().toString())) {
                System.out.println(i);
                break;
            }
        }
    }
}