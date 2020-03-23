/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/3/16 下午5:28
 */

import java.util.Scanner;

public class J2596 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int k = cin.nextInt();
        int count = 0;
        boolean[] light = new boolean[n];
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                if ((j + 1) % i == 0) light[j] = !light[j];
            }
        }
        for (int i = 0; i < light.length; i++) {
            if (light[i]) {
                System.out.print((i + 1) + " ");
                count++;
            }
        }
        if (count == 0) System.out.println("None");
        cin.close();
    }
}
