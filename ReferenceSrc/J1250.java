import java.util.Scanner;

public class J1250 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int a = cn.nextInt();
        int b = cn.nextInt();
        int start = 0;
        int end = 0;
        for(int i =0;i<a;i++){
            start=start*10+1;
            end = end*10+b;
        }
        for(int i = start;i<=end;i++){
            if(contain(i,b)) continue;
            System.out.println(i);
        }
    }
    //使用检查排除法，将不需要输出的元素去掉即可
    private static boolean contain(int i,int b) {
        while(i>0){
            int z = i%10;
            if(z>b||z==0){
                return true;
            }
            i/=10;
        }
        return false;
    }
}