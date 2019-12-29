/*
 * Copyright (c) 2019. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2019/12/26 下午9:29
 */

import java.util.*;

public class J1102 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int m = cin.nextInt();
            int n = cin.nextInt();
            int sumEven = 0;
            int sumOdd = 0;
            for (int i = m; i < n + 1; i++) {
                if (i % 2 == 0) {
                    sumEven += i * i;
                } else if (i % 2 != 0) {
                    sumOdd += i * i * i;
                }
            }
            System.out.printf("%d %d\n", sumEven, sumOdd);
        }
    }
}