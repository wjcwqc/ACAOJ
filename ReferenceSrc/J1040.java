/*
 * Copyright (c) 2019. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2019/12/26 下午9:32
 */

import java.util.*;

public class J1040 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int c = cin.nextInt();
        int sum = 0;
        for (int i = 1; i <= c; i += 2) {
            sum += i;
        }
        System.out.printf("%d", sum);
        cin.close();
    }
}
