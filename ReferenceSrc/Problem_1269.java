import java.util.Scanner;

import static java.lang.Math.pow;

public class Problem_1269 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[][] l = new int[12][4096];
        l[0][0] = cin.nextInt();
        int a = cin.nextInt();
        outer:for (int i = 0; i < 11; i++) {
            for (int n = 0; n <= pow(2, i + 1); n++) {
                if (l[i][n / 2] == 0) {
                    continue;
                } else if (n % 2 == 0) {
                    l[i + 1][n] = 3 * l[i][n / 2];
                } else {
                    l[i + 1][n] = l[i][n / 2] / 2;
                }
                if (l[i + 1][n] == a) {
                    a = i;
                    l[0][0] = n;
                    System.out.println(a+1);
                    break outer;
                }
            }
        }
//        for(int i = 0;i<=11;i++){
//            for(int n = 0;n<pow(2,i);n++){
//                System.out.printf("%d\t",l[i][n]);
//            }
//            System.out.printf("\n");
//        }
        for(;a>=0;a--){
            if(l[0][0]%2==0){
                System.out.printf("f");
            }else{
                System.out.printf("g");
            }
            l[0][0]/=2;
        }

    }
}
