/*
 * Copyright (c) 2019. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2019/12/26 下午9:09
 */

import java.util.Scanner;

public class J1101 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        while (n-- > 0) {
            int a = cin.nextInt();
            int b = cin.nextInt();

            int sum = (a % 100 + b % 100) % 100;
            System.out.println(sum);
        }
        cin.close();
    }
}