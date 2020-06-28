/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/6/7 下午5:25
 */

import java.util.Scanner;

public class J2828 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int num=cin.nextInt();
        String[] name=new String[num];
        int[] score=new int[num];
        int max=0;
        int result=0;
        for (int i=0;i<num;i++) {
            String na = cin.next();
            int sc = cin.nextInt();
            int sava = find(name, na);
            score[sava] += sc;
            if (score[sava] > max) {
                result = sava;
                max = score[sava];
            }
//            else if(sava==result&&sc<0)
            //TODO

        }
        System.out.println(name[result]);

    }
    public static int find (String[] StringArray, String str){
        int i=0;
        while (StringArray[i]!=null){
            if (StringArray[i]==str){
                break;
            }
            i++;
        }
        if(StringArray[i]==null)StringArray[i]=str;
        return i;
    }
}
