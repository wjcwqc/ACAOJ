/*
 * Copyright (c) 2019. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2019/12/26 下午9:53
 */

import java.util.Scanner;

public class J1573 {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int n = cin.nextInt();
        while (n-- > 0) {
            String a = cin.next();
            char[] b = a.toCharArray();
            int moda = 1;
            int modb = 1;
            int l = b.length;
            while (moda == 1 || modb == 1) {
                if (l % 2 == 0) {
                    for (int i = 0; i < l / 2; i++) {
                        if (b[i] != b[i + l / 2]) {
                            moda = 0;
                        }
                        if (b[i] != b[l - 1 - i]) {
                            modb = 0;
                        }
                    }
                } else {
                    break;
                }
                if (moda == 1 || modb == 1) {
                    l /= 2;
                }
            }
            System.out.println(l);
        }
    }
}
