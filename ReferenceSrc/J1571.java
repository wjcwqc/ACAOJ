import java.util.Scanner;

public class J1571 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        while (N-->0){
            int m = cin.nextInt();
            int count = 0;
            for (int i = m; i >=1; i--) {
                count+=sum(i);
            }
            System.out.println(count);
        }
    }

    private static int sum(int m) {
        return (m+1)*m/2;
    }
}
