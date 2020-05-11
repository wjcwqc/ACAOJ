/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/5/11 下午4:58
 */

import java.util.Scanner;

public class J1117 {
    static Scanner cin = new Scanner(System.in);

    static public void main(String[] args) {
        while (cin.hasNext()) {
            int a = 100 * cin.nextInt();
            int b = cin.nextInt();
            if (a == 0 && b == 0) break;
            for (int i = 0; i < 100; i++) {
                if ((a + i) % b == 0) {
                    if (i < 10) System.out.printf("0");
                    System.out.printf("%d ", i);
                }
            }
            System.out.printf("\n");
        }

    }
}
