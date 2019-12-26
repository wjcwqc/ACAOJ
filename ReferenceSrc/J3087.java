/*
 * Copyright (c) 2019. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2019/12/26 下午9:17
 */

import java.util.Arrays;
import java.util.Scanner;

public class J3087 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t-- > 0) {
            int a = cin.nextInt();
            int[] b = new int[a];
            for (int i = 0; i < a; i++) {
                b[i] = cin.nextInt();
            }
            int l = cin.nextInt();
            Arrays.sort(b);
            int c = 0;
            for (int i = 0; i < a; i++) {
                if (l == b[i]) {
                    c = i;
                    break;
                }
            }
            System.out.println(c + 1 + " " + b[a - c - 1]);
        }
    }
}
