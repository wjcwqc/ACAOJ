import java.util.Scanner;

public class Problem_1080 {
    public static void main(String[] args) {
        int Max = Integer.MAX_VALUE;
        long uMax = 4294967296L;//(long) pow(2, 32)
        long sum = 0;
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            long num = cin.nextLong();
            int temp;
            if (num > Max) temp = (int) (num - uMax);
            else temp = (int) num;
            String str = Integer.toBinaryString(temp);
            StringBuilder s = new StringBuilder(str);
            if (s.length() < 32) {
                for (int i = 0; i < 32 - str.length(); i++)
                    s.insert(0, 0);
            }
            str = s.toString();
            if (str.equals(s.reverse().toString())) ++sum;
        }
        System.out.println(sum);
        cin.close();
    }
}
