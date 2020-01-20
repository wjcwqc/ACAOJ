import java.util.Scanner;

public class J1334 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        hanoi(n,'A','B','C');
        cn.close();
    }
    private static void hanoi(int i,char A,char B,char C) {
        if(i==1) {
            move(i,A,B);
        }
        else {
            hanoi(i-1,A,C,B);
            move(i,A,B);
            hanoi(i-1,C,B,A);
        }
    }
    private static void move(int i,char x,char y) {
        System.out.println(i+" "+x+" "+y);
    }
}