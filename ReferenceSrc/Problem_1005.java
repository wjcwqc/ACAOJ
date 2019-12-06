import java.util.Scanner;

public class Problem_1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, b, c;
        while (sc.hasNext()) {
            n = sc.nextInt();
            while (n-- > 0) {
                a = sc.nextInt();
                b = sc.nextInt();
                c = a;
                while (b-- > 0) {
                    if (b == 0) c++;
                    for (int i = 0; i < c - 1; i++) {
                        for (int j = 0; j < a; j++) {
                            if (i <= j && (i + j) == a - 1 || i == j && i > a / 2) {
                                System.out.print("X");
                                break;
                            }
                            if (i == j || (i + j) == a - 1)
                                System.out.print("X");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

