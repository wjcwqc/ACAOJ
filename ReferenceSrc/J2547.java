/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/5/31 下午1:01
 */

import java.util.Scanner;

public class J2547 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while (cin.hasNext()){
            int a=cin.nextInt();
            int b=cin.nextInt();
            if(a==0&&b==0)break;
            int c=(a+b)%7;
            if (c==0)c=7;
            System.out.println(c);
        }
    }
}
