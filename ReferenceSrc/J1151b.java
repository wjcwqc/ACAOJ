import java.util.Scanner;

public class J1151b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a[] = new int[b];
        for (int i = 0; i < b; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            System.out.println(find(a[i]));
        }
    }

    //可能会造成算法超时
    private static int find(int n) {
        int number;
        if (n == 0 || n == 1) {
            number = 0;
        } else if (n == 2) {
            number = 1;
        } else if (n == 3) {
            number = 2;
        } else {
            number = find(n - 1) + find(n - 2);
        }


        return number;

    }
}
