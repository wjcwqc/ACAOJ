import java.util.Arrays;
import java.util.Scanner;

public class J1029 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = cin.nextInt();
            }
        }
        //System.out.println(arr[1][1]);
        int count = 0;
        for (int i = 0,j = 0,k = arr.length-1; i < arr.length; i++,j++,k--) {
            count +=arr[i][j];
            count +=arr[i][k];
        }
        if(N%2==0){
            System.out.println(count);
        }else {
            System.out.println(count-arr[(arr.length/2)][(arr.length/2)]);
        }
    }
}
