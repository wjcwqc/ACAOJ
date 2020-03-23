/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/3/23 下午6:18
 */


import java.util.Scanner;

public class J2278bl {
    public static void main(String[] args) {
        String[] Fibonacci = {"1", "1", "2", "3", "5", "8", "13", "21", "34", "55", "89", "144", "233", "377", "610", "987", "1597", "2584", "4181", "6765", "10946", "17711", "28657", "46368", "75025", "121393", "196418", "317811", "514229", "832040", "1346269", "2178309", "3524578", "5702887", "9227465", "14930352", "24157817", "39088169", "63245986", "102334155", "165580141", "267914296", "433494437", "701408733", "1134903170", "1836311903", "2971215073", "4807526976", "7778742049", "12586269025"};
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(Fibonacci[n - 1]);
    }
}
