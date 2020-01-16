import java.util.Scanner;

public class J1329 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while(cn.hasNext()){
            int n = cn.nextInt();
            int h = cn.nextInt();
            int count = 0;
            for(int i =0;i<n;i++){
                int a = cn.nextInt();
                if(a<=h) count++;
                else count+=2;
            }
            System.out.println(count);
        }
    }
}