import java.util.Scanner;
public class Problem_1034 {
    public static void main(String[] args) {
        result();
    }
    /*判断输入的数字是否为质数*/
    public static boolean judge(int x){
        if(x==1||x==0){
            return false;
        }
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    /*结果*/
    public static void result(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(judge(n)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }
}