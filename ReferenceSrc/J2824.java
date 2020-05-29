/**
 * @author MWD
 * @date 2020年5月29日 0029 15:49
 */
import java.util.Scanner;

public class J2824 {

    static int n;
    static int a[];
    static int count;
    static boolean flag = false;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        count = 0;
        a = new int[n+1];
        init();
        if((n&1)!= 0){
            System.out.println("no solution");
        }else{
            search(1);
            if(count == 0) {
                System.out.println("no solution");
            }
        }

    }

    public static void init(){
        for(int i=0; i<n+1; ++i){
            a[i] = i;
        }
    }

    public static void search(int m){
        if (flag) {
            return;
        }
        int i;
        if(m > n)
        {
            if(isPrime(a[1]+a[n])){
                count++;
                printResult();
                flag = true;
            }

        }
        else
        {
            for(i=m;i<=n;i++)
            {
                swap(m,i);
                if((m-1) == 0 || isPrime(a[m]+a[m-1])) {
                    search(m+1);
                }
                swap(m,i);
            }
        }
    }

    public static void swap(int m, int i){
        int tmp = a[m];
        a[m] = a[i];
        a[i] = tmp;
    }

    public static boolean isPrime(int num){
        int i;
        for(i=2; i*i<=num; ++i){
            if(num%i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void printResult(){
        for(int i=1; i<=n; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

}
