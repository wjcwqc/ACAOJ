/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/5/31 下午1:07
 */

import java.util.Scanner;

public class J1509 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while (cin.hasNext()){
            int n=cin.nextInt();
            int m=cin.nextInt();
            int p=cin.nextInt();
            int[][] mine=new int[n+2][m+2];
            for (int i=0;i<p;i++){
                int x=cin.nextInt();
                int y=cin.nextInt();
                mine[x+1][y+1]=9;
                for(int a=x;a<x+3;a++){
                    for (int b=y;b<y+3;b++){
                        mine[a][b]++;
                    }
                }
            }
            for (int x=1;x<n+1;x++){
                for (int y=1;y<m+1;y++){
                    if(mine[x][y]>9){
                        System.out.printf("*");
                    }else {
                        System.out.printf("%d",mine[x][y]);
                    }
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
}
