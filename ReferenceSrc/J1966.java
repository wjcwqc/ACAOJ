import java.util.*;

public class J1966 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        for (int i = 0; i < t; i++) {
            String str = input.nextLine();
            char s[] = str.toCharArray();
            if (s[0] != ' ') {
                if (s[0] >= 'A' && s[0] <= 'Z') {
                    System.out.print(s[0]);
                } else {
                    s[0] = (char) (s[0] - 32);
                    System.out.print(s[0]);
                }
            }
            for (int j = 1; j < s.length; j++) {
                if (s[j - 1] == ' ' && s[j] != ' ') {
                    if (s[j] >= 'A' && s[j] <= 'Z') {
                        System.out.print(s[j]);
                    } else {
                        s[j] = (char) (s[j] - 32);
                        System.out.print(s[j]);
                    }
                }
            }
            System.out.println();
        }
    }
}