/*
 * Copyright (c) 2019. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2019/12/26 下午9:20
 */

import java.util.Scanner;

public class J3085 {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        while (cin.hasNext()) {
            double x = cin.nextInt();
            System.out.printf("%.3f\n", x / 400 * 50);
        }
    }
}
