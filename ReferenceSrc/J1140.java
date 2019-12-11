import java.util.Scanner;

public class J1140 {
    private static int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    private static int[] arr = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String[] s = cin.next().split("/");
            int year = Integer.parseInt(s[0]);
            int month = Integer.parseInt(s[1]);
            int day = Integer.parseInt(s[2]);
            if (month == 1) {
                System.out.println(day);
                continue;
            }
            int tot = 0;
            for (int i = 1; i < arr.length; i++) {
                if (month == a[i]) tot = arr[i - 1];
            }
            tot = tot + day;
            System.out.println(tot);
        }
        cin.close();
    }
}
