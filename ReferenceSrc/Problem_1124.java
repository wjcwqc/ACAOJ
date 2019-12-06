import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class Problem_1124 {
    static Scanner cin =new Scanner(System.in);
    static int n=cin.nextInt();
    static int m=cin.nextInt();
    static int d=cin.nextInt();
    static int[][][] t=new int[3][n][m];
    public static void main(String[] args) {
        for(int y=0;y<n;y++){
            for(int x=0;x<m;x++){
                t[0][y][x]=cin.nextInt();
            }
        }
        for(int y=0;y<n;y++){
            for(int x=0;x<m;x++){
                t[1][y][x]=cin.nextInt();
            }
        }
        wf();
        pf();
    }

    private static void wf() {
        //TODO
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.println();
        }
    }

    private static void pf() {
        //Todo
    }
}
