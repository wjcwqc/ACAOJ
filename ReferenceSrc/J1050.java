/*
 * Copyright (c) 2019. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2019/12/26 下午9:33
 */

import java.util.*;

public class J1050 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            int a = 0;
            int c = 0;
            for (int i = 1; i <= n; i++) {
                a += i;
                c += 1;
                if (c == m || i == n) {
                    System.out.printf("%d" + " ", a * 2 / c);
                    c = 0;
                    a = 0;
                }

            }
            System.out.printf("\n");
        }
        cin.close();
    }
}

