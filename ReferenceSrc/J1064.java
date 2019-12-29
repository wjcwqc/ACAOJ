/*
 * Copyright (c) 2019. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2019/12/26 下午9:27
 */

import java.util.*;

public class J1064 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            double a = cin.nextDouble();
            double b = 4.0 * Math.PI * a * a * a / 3;
            System.out.printf("%.3f\n", b);
        }
        cin.close();
    }
}