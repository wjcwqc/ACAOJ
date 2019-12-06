import java.util.Scanner;

public class Problem_1079 {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            int n = cin.nextInt();
            int[][] sq=new int[n][n];
            int a=n-1;int b=n/2;
            int la=n-1;int lb=n/2;
            for(int i=1;i<=n*n;i++){
                if(sq[a][b]==0){
                    la=a;lb=b;
                    sq[a][b]=i;
                }else{
                    la-=1;
                    if(la<0)la=n;
                    sq[la][lb]=i;
                }
                a=la+1;b=lb+1;
                if(a==n)a=0;
                if(b==n)b=0;
            }
            for(int i=0;i<n;i++){
                for(int m=0;m<n;m++){
                    System.out.printf("%d ",sq[i][m]);
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
}
