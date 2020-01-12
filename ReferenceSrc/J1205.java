import java.util.Arrays;
import java.util.Scanner;

public class J1205 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        while(n-->0){
            String str = cn.next();
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            for(int i =0;i<ch.length;i++){
                if(i<ch.length-1) System.out.print(ch[i]+" ");
                else System.out.println(ch[i]);
            }
        }
    }
}