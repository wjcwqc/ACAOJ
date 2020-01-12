import java.util.Scanner;

public class J1192 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while(cn.hasNext()){
            int n = cn.nextInt();
            int[] a = new int[n];
            for(int i =0;i<n;i++){
                a[i] = cn.nextInt();
            }
            int max = 0;
            for(int i =0;i<n;i++){
                int counts =0;
                for(int j =i+1;j<n;j++){//进行循环判断是否重复
                    if(a[i]==a[j]){
                        counts ++;//并计算重复的度数
                        i =j;//同时返回到检查的j值，之前的i值就可以省略检查
                    }else break;
                }
                if(max<counts) max = counts;//更新最大的度数
            }
            System.out.println(max+1);//输出度数并加上他的本身
        }
    }
}
