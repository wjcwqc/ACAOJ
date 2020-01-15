import java.util.Scanner;

public class J1293 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        for(int i = 0;i< n;i++){
            for(int j = 0;j<i;j++)
                System.out.print(" ");
            for(int k = n;k>i;k--)
                System.out.print('#');
            for(int k = n-1;k>i;k--)
                System.out.print('#');
            System.out.println();
        }
    }
}