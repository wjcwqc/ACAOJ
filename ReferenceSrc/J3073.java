/*
 * Copyright (c) 2019. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2019/12/26 下午9:53
 */

import java.math.BigInteger;
import java.util.Scanner;

public class J3073 {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            long sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += cin.nextLong();
            }
            System.out.println(sum);
        }
    }
}
