import java.util.Arrays;

public class J1299 {
    public static void main(String[] args) {
        for(int i = 123;i<330;i++){
            int[] a = new int[10];
            Arrays.fill(a, 0);
            int n = 2*i;
            int m = 3*i;
            int k = i;
            while(k>0){
                ++a[k%10];
                k/=10;
            }
            while(n>0){
                ++a[n%10];
                n/=10;
            }
            while(m>0){
                ++a[m%10];
                m/=10;
            }
            if(a[0]!=0) continue;
            boolean flag = false;
            for(int j = 0;j<10;j++){
                if(a[j]>1){
                    flag = true;
                    break;
                }
            }
            if(flag) continue;
            else System.out.println(i+" "+2*i+" "+3*i);
        }
    }
}