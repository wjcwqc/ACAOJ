/*
 * Copyright (c) 2019. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2019/12/26 下午9:26
 */

import java.util.*;
import java.lang.Math.*;

public class J1094 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
        while (num-- > 0) {
            double a = cin.nextDouble();
            System.out.printf("%.6f\n", a * a * Math.PI);
        }
        cin.close();
    }
}
