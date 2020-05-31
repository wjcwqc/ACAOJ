/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/5/31 下午1:27
 */

import java.util.Scanner;

public class J2518 {
    public static int cnt = 0;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        for (; a > 0; a--) {
            int m = cin.nextInt();
            int n = cin.nextInt();
            splitapple(m, n,m*1.0/n);
            System.out.println(cnt);
        }
    }

    private static void splitapple(int a, int b,double max) {
        for (int i = 0; i <= (int)max; i++) {
            System.out.println((int)max);
            if (b > 2) {
                splitapple(i, b - 1,Math.max(max,i));
                System.out.println("debug"+i+" "+b);
            }else if(b==2){
                cnt += (a + 1) / 2;
            }
        }
//        TODO
    }
}
