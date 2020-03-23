import java.util.Scanner;

public class J2043 {
    public static void main(String[] args) {
        long[] data = new long[1000000];
            data[0]=0;
            data[1]=1;
            data[2]=2;
            data[3]=4;
            for(int i=4;i<1000000;i++){
                data[i]=(data[i-1]+data[i-2]+data[i-3])%998244353;
            }
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
            while(T-->0){
                int N = cin.nextInt();
                System.out.println(data[N]);
            }

    }
}
