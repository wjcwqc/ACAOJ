/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/5/31 下午2:31
 */

import java.util.Scanner;

public class J2039 {
   public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        while (cin.hasNext()){
            long p=cin.nextLong();
            if(check(p)){
                System.out.println("Accepted");
            }else {
                System.out.println("Wrong");
            }
        }
    }
    public static boolean check(long p){
        boolean flag=true;
        while (p%2==0){
            p/=2;
        }
        while (p%5==0){
            p/=5;
        }
        while (p%3==0){
            p/=3;
        }
        if(p!=1)flag=false;
        return flag;
    }
}
