import java.util.Scanner;

public class J1211 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        while(n-->0){
            int m = cn.nextInt();
            String result = "";
            while(m>0){//进行二进制转化
                if(m%2==0) result +="0";
                else result +="1";
                m/=2;
            }
            int length = result.length();
            for(int i =length;i<32;i++){
                result+="0";
            }
            StringBuffer sb = new StringBuffer(result);//使用StringBuffer的reverse方法
            System.out.println(sb.reverse());
        }
    }
}