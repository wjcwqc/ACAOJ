import java.util.Scanner;

public class J1214 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        int m = cn.nextInt();
        int[] weight = new int[n+1];
        int[] value = new int[n+1];
        int[][] f = new int[n+1][100000];
        for(int i =1;i<=n;i++){
            weight[i] = cn.nextInt();
        }
        for(int i =1;i<=n;i++){
            value[i] = cn.nextInt();
        }
        for(int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(weight[i]<=j)
                    f[i][j] = Math.max(f[i-1][j], f[i-1][j-weight[i]]+value[i]);//使用数组找到最优解，每层都寻找到，最优解
                else f[i][j] = f[i-1][j];
            }
        }
        System.out.println(f[n][m]);
    }
}