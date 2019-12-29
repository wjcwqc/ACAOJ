import java.util.Scanner;

public class J1035 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        //TODO
        for(int i = 0; i <= 200000; i ++){
            long num = (long)i * (long)i;
            String tmp = String.valueOf(num);
            String str = String.valueOf(i);

//            char a = tmp.charAt(tmp.length() - 1);
//            char b = str.charAt(str.length() - 1);
            int n = tmp.length();
            int m = str.length();
            if(tmp.substring(n - m).equals(str)){
                System.out.print(i + "  ");
            }
        }
        cin.close();
    }
}
