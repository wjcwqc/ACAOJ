import java.util.Scanner;

public class Problem_1021 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        char[] chars = str.toCharArray();
        int cnt = 0;
        for (int i = 0; i < chars.length; i++) {
            if((chars[i] >= 'A' && chars[i] <= 'Z')||(chars[i] >= 'a' && chars[i] <= 'z')){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
