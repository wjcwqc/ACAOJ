import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class J1235 {
    static Scanner cin=new Scanner(System.in);

    public static void main(String[] args) {
        String str;
        int n=cin.nextInt();
        while(n>0){
            str=cin.next();
            pro(n,str);
            n=cin.nextInt();
        }
    }

    private static void pro(int n, String str) {
        int i=str.length()/n;//i=输出
        int rst =0;
        if(i>0){
            outer:while(i>0){
                for(int x=0;x<=str.length()-i*n;x++){
                    if(rec(str.substring(x,x+i),str)>=n)
                        rst=i;
                        break outer;
                }
                i--;
            }
        }
        System.out.println(rst);
    }

    private static int rec(String substring, String str) {
        Pattern p=Pattern.compile(substring);
        Matcher m=p.matcher(str);
        int cnt=0;
        while(m.find()){
            cnt++;
        }
        return cnt;
    }

}
