import java.util.Scanner;

public class J1258 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()) {
            int n = cn.nextInt();
            int[][] a = new int[n][n];
            int c = 0, cout = 1;
            int z = n * n;
            while (cout <= z) {
                int i = 0, j = 0;
                for (i += c, j += c; j < n - c; j++) {
                    if (cout > z)
                        break;
                    a[i][j] = cout++;
                }//从左至右的循环
                for (j--, i = i + 1; i < n - c; i++) {
                    if (cout > z)
                        break;
                    a[i][j] = cout++;
                }//从上至下的循环
                for (i--, j = j - 1; j >= c; j--) {
                    if (cout > z)
                        break;
                    a[i][j] = cout++;
                }//从右至左的循环
                for (j++, i = i - 1; i > c; i--) {
                    if (cout > z)
                        break;
                    a[i][j] = cout++;
                }//从下至上的循环
                c++;
            }
            for(int i =0;i<n;i++){
                for(int j =0;j<n;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}