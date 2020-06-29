/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/6/28 下午7:26
 */

import java.util.Scanner;

public class J2810 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        while (n-- > 0) {
            Long a = cin.nextLong();
            Long b = cin.nextLong();
            if (b % a != 0) {
                System.out.println("-1");
            } else {
                b /= a;
                long cnt = 0;
                while (b % 2 == 0) {
                    b /= 2;
                    cnt++;
                }
                while (b % 3 == 0) {
                    b /= 3;
                    cnt++;
                }
                if (b != 1) {
                    cnt = -1;
                }
                System.out.println(cnt);

            }
        }
    }
}
