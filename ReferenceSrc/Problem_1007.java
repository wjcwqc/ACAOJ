import java.util.Scanner;

public class Problem_1007 {
    private static Scanner cin = new Scanner(System.in);
    private static int begin = cin.nextInt();
    private static int end = cin.nextInt();
    private static int len = cin.nextInt();
    private static String data = cin.next();
    private static int time;
    private static int[] arr = new int[27];

    private static boolean test() {
        int ends = end;
        int lens = len;
        time++;
        if (time == 6) return false;
        while (arr[lens] == ends) {
            ends--;
            lens--;
        }
        if (lens == 0) return false;
        arr[lens]++;
        for (int i = lens + 1; i <= len; i++) {
            arr[i] = arr[i - 1] + 1;
        }
        for (int i = 1; i <= len; i++) {
            System.out.print((char) (arr[i] + 'a' - 1));
        }
        System.out.println();
        return true;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= data.length(); i++) {
            arr[i] = data.charAt(i - 1) - 'a' + 1;
        }
        while (test()) ;
    }
}