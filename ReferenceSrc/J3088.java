/*
 * Copyright (c) 2019. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2019/12/26 下午9:16
 */

import java.util.Scanner;

public class J3088 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int l = cin.nextInt();
            int e = cin.nextInt();
            int[] a = {l / 10000, l / 100 % 100, l % 100};
            int[] b = {e / 10000, e / 100 % 100, e % 100};
            int cnt = 0;
            while (a[0] != b[0] || a[1] != b[1] || a[2] != b[2]) {
                if (a[0] % 4 == 0) {
                    m[1] = 29;
                } else {
                    m[1] = 28;
                }
                a[2]++;
                if (a[2] > m[a[1] - 1]) {
                    a[1]++;
                    a[2] = 1;
                }
                if (a[1] > 12) {
                    a[0]++;
                    a[1] = 1;
                    a[2] = 1;
                }
                cnt++;
            }
            System.out.println(++cnt);
        }
    }
}