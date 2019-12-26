/*
 * Copyright (c) 2019. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2019/12/26 下午9:31
 */

import java.util.*;

public class J1268 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()) {
            int a = cn.nextInt();
            int b = cn.nextInt();
            int c = back(back(a) * back(b));
            System.out.println(c);
        }
    }

    private static int back(int a) {
        int s = 0;
        while (a > 0) {
            s = s * 10 + a % 10;
            a /= 10;
        }
        return s;
    }
}
