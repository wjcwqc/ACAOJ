
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author MWD
 * @date 2020年5月11日 0011 17:37
 */
public class J1174b {
    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            seat(cin.nextInt());
        }
    }

    private static void seat(int N) {
        Time[] arr = new Time[N];
        for (int i = 0; i < arr.length; i++) {
            int start = cin.nextInt(), end = cin.nextInt();
            arr[i] = new Time(start, end);
        }
        Arrays.sort(arr);
        int tot = 0, temp = 0;
        for (Time time : arr) {
            if (time.start >= temp) {
                ++tot;
                temp = time.end;
            }
        }
        System.out.println(tot);
    }

    private static class Time implements Comparable<Time> {
        int start, end;

        Time(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Time o) {
            return this.end - o.start;
        }
    }
}

