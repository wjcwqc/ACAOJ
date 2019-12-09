import java.util.Scanner;

public class J1122 {
    static Scanner cin=new Scanner(System.in);
    static final int max = 10000;
    static final int[] prime =new int[max];
    static final int[] p =new int[max];

    public static void main(String[] args) {
        initial();
        int a=cin.nextInt();
        int b=cin.nextInt();
        int rst=div(a);
        for(++a;a<=b;a++){
            rst=Math.max(div(a),rst);
        }
        System.out.println(rst);
    }

    public static boolean isprime(int a){
        return p[a]==0;
    }
    public static void initial(){
        for(int i=2;i<max;i++){
            if(p[i]==1)continue;
            for(int x=2*i;x<max;x+=i){
                if(p[x]==1)continue;
                p[x]=1;
            }
        }
    }
    private static int div(int a) {
        int cnt = 0;
        if (a < 1) cnt = -1;
        else if (a > 1) {
            cnt = 1;
            if (find(a) < 0) {
                while (a > 1) {
                    int rec = 1;
                    for (int i = 0; prime[i] <= a; i++) {
                        while (a % prime[i] == 0) {
                            a /= prime[i];
                            ++rec;
                        }
                        cnt *= rec;
                        rec = 1;
                    }
                }
            }
        }
        if(cnt<2)cnt++;
        return cnt;
    }

    private static int find(int p) {
        int rst = -1;
        int i = (prime.length + 1) / 2;
        int l = i / 2;
        while (l > 0) {
            if (p == prime[i]) {
                rst = i;
                break;
            } else if (p > prime[i]) {
                i = i + l;
            } else {
                i = i - l;
            }
            l = (l + 1) / 2;
            if (rst < 0 && l == 1) {
                rst--;
            }
            if (rst < -3) break;
        }
        return rst;
    }
}
