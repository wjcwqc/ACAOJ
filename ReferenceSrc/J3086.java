/*
 * Copyright (c) 2019. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2019/12/26 下午9:18
 */

import java.util.Scanner;

public class J3086 {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            long a = cin.nextLong();
            long b = cin.nextLong();
            long t = gcd(a, b);
            System.out.println(a / t + "/" + b / t);
        }
    }

    private static long gcd(long a, long b) {
        long t = a;
        while (a != b && a % b > 0) {
            a = a % b;
            t = a;
            a = b;
            b = t;
        }
        return Math.min(a, b);
    }
}
