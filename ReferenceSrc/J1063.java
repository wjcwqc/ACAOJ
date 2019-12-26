/*
 * Copyright (c) 2019. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2019/12/26 下午9:28
 */

import java.util.*;
import java.lang.Math.*;

public class J1063 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            double x1 = cin.nextDouble();
            double y1 = cin.nextDouble();
            double x2 = cin.nextDouble();
            double y2 = cin.nextDouble();
            // double distance =Math.sqrt(((x1 - x2)*(x1 - x2))+((y1 - y2)*(y1 - y2)));
            System.out.printf("%.2f\n", Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2))));
        }
    }
}
