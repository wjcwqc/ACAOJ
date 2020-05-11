/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/5/11 下午5:49
 */

import java.util.Scanner;

public class J1581 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] arr = new int[1001];
        int n = cin.nextInt();
        for (int i = 0; i < n; i++) {
            arr[cin.nextInt()] = 1;
        }
        int cnt = 0;
        int[] out = new int[100];
        for (int i = 1; i <= 1000; i++) {
            if (arr[i] == 1) {
                out[cnt] = i;
                cnt++;
            }
        }
        System.out.println(cnt);
        for (int i = 0; i < cnt; i++) {
            System.out.printf("%d ", out[i]);
        }
    }
}
