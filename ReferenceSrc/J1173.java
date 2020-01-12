import java.util.Scanner;

public class J1173 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        double sum = 0,i = 0; //int 整数类型不够，会损失精度
        while (sum <= n) {//找到，离定义最近的数的2 的指数
            sum =  Math.pow(2, i);
            i++;
        }
        double a =  Math.pow(2, i - 1);
        double b =  Math.pow(2, i - 2);
        if (a - n < n - b)//进行判断
            System.out.println((long)a);//最后再将，double 类型转化为long类型
        else
            System.out.println((long)b);
    }
}