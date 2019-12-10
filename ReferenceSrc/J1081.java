import java.util.Arrays;
import java.util.Scanner;

public class J1081 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int N = cin.nextInt();
            if (N == 0) break;
            String[] str = new String[N];
            for (int i = 0; i < N; i++) {
                str[i] = cin.next();
            }
            Arrays.sort(str);
            boolean[] b = new boolean[N];
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++)
                    if (sort(str[i]).equals(sort(str[j]))) {
                        b[i] = true;
                        b[j] = true;
                    }
            }
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < N; i++) {
                if (!b[i]) ans.append(str[i]).append(" ");
            }
            if (ans.toString().isEmpty()) System.out.println("None");
            else {
                System.out.println(ans.substring(0, ans.length() - 1));
            }
        }
        cin.close();
    }

    private static String sort(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
