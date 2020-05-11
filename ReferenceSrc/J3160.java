/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/3/30 下午3:00
 */

import java.util.Arrays;
import java.util.Scanner;

public class J3160 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int big = 0;
            int[] a = new int[4];
            for (int i = 0; i < 4; i++) {
                a[i] = cin.nextInt();
            }
            Arrays.sort(a);
            System.err.println(Arrays.toString(a));
            System.out.println(a[3] * (a[2] * 100 + a[1] * 10 + a[0]));
        }
    }

}
