import java.util.Scanner;

public class J1122_db {
    static Scanner cin=new Scanner(System.in);
    public static void main(String[] args) {
        int a=cin.nextInt();
        int b=cin.nextInt();
        int[] table = {};
        int rst=table[a];
        for(++a;a<=b;a++){
            rst=Math.max(table[a],rst);
        }
        System.out.println(rst);
    }
}