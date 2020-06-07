/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/6/7 下午4:21
 */

import java.util.Scanner;

public class J2809 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int cnt = 0;
        while (cin.hasNext()) {
            String str = cin.nextLine();
            int num = str.indexOf("+");
            if (num > 0) {
//                String[] plus=str.split("\\+");
                String fir = str.split("\\+")[0];
                String sec = str.split("\\+")[1].split("\\=")[0];
                String thr = str.split("\\=")[1];
                long a = Long.parseLong(fir);
                long b = Long.parseLong(sec);
                long c = Long.parseLong(thr);
                if (a + b == c)
                    cnt++;
            } else {
//                String[] minus=str.split("\\-");
                String fir = str.split("\\-")[0];
                String sec = str.split("\\-")[1].split("\\=")[0];
                String thr = str.split("\\=")[1];
                long a = Long.parseLong(fir);
                long b = Long.parseLong(sec);
                long c = Long.parseLong(thr);
                if (a - b == c)
                    cnt++;
            }
        }
        System.out.printf("RIGHT:%d", cnt);
    }
}
