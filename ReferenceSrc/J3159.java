/*
 * Copyright (c) 2020. wjcwqc.All rights reserved.
 * License:GNU Public License
 * Project name:ACAOJ
 * Auther:wjcwqc
 * Date:2020/3/30 下午2:50
 */

import java.math.BigInteger;
import java.util.Scanner;

public class J3159 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            BigInteger a = cin.nextBigInteger();
            BigInteger b = cin.nextBigInteger();
            BigInteger c = cin.nextBigInteger();
            System.out.println(a.add(b.add(c)));
        }
        cin.close();
    }
}
