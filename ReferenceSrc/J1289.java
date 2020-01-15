import java.util.Scanner;

public class J1289 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int min = 1000;
        int max = 0;
        int sum = 0;
        int count =0;
        while(cn.hasNext()){
            int a = cn.nextInt();
            if(min>a) min = a;
            if(max<a) max = a;
            sum += a;
            count++;
        }
        System.out.print(min+" "+max+" ");
        System.out.printf("%.3f\n",1.0*sum/count);
    }
}