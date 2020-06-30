/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/6/30 下午2:55
 */

import java.util.Scanner;

public class J3186 {
    public static void main(String[] args) {
        long weight = cin.nextInt();
        double time = cin.nextDouble();
        System.out.println(calc(weight, time));
    }

    static Scanner cin = new Scanner(System.in);

    public static int calc(long weight, double time) {
        double cost = 0;
        if (weight == 1) {
            cost += 8;
        } else if (weight == 2) {
            cost += 9;
        }
        if (time <= 2.5) {
            cost += 0;
        } else if (time <= 15) {
            cost += (1.4 * (time - 2.5));
        } else {
            cost += (15 - 2.5) * 1.4 + 2.1 * (time - 15);
        }

        return (int) Math.round(cost);
    }
}
