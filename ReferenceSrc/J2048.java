/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/5/31 下午3:03
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class J2048 {
    static Scanner cin=new Scanner(System.in);
    public static void main(String[] args) {
        while (cin.hasNext()) {
            String exp[] = cin.nextLine().split("\\s");
            Stack<Integer> S = new Stack<>();
            for (String s : exp) {
                if (s.equals("+") || s.equals("*") || s.equals("-") || s.equals("/")) {
                    int b = S.peek();
                    S.pop();
                    int a = S.peek();
                    S.pop();
                    switch (s.charAt(0)) {
                        case '+':
                            S.push(a + b);
                            break;
                        case '*':
                            S.push(a * b);
                            break;
                        case '-':
                            S.push(a - b);
                            break;
                        case '/':
                            S.push(a / b);
                            break;
                    }
                } else {
                    S.push(Integer.parseInt(s));
                }
            }
            System.out.println(S.peek());
        }
    }
}