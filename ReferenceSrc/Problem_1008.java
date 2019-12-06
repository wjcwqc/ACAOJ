import java.util.Scanner;

public class Problem_1008 {
    private static int k = 0;

    public static int f(int n) {
        //问题边界，n==1时,除了0以外的k-1位数都符合
        if (n == 1) return k - 1;
        //问题边界，n==2时，第一位不能取0，所以有k-1中。后一位可取0，有k种
        if (n == 2) return (k - 1) * k;
        //递归求解
        return f(n - 1) * (k - 1) + f(n - 2) * (k - 1);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        k = cin.nextInt();
        System.out.println(f(n));
    }
}