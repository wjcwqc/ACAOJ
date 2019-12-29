/*
 * Copyright (c) 2019. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2019/12/26 下午9:36
 */

import java.util.Scanner;

public class J1108 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int t = cin.nextInt();
            if (t <= 100 && t >= 90) {
                System.out.println("A");
            } else if (t < 90 && t >= 80) {
                System.out.println("B");
            } else if (t < 80 && t >= 70) {
                System.out.println("C");
            } else if (t < 70 && t >= 60) {
                System.out.println("D");
            } else if (t < 60 && t >= 0) {
                System.out.println("E");
            } else {
                System.out.println("Score is error!");
            }
        }
        cin.close();
    }
}
