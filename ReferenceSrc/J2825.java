/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/6/7 下午4:13
 */

import javax.swing.text.Element;
import java.util.Scanner;

public class J2825 {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        long n=cin.nextLong();
        n=n*2;
        int sqrt=(int)Math.sqrt(n);
        if(sqrt*(sqrt+1)==n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
