import java.util.Scanner;

public class J1113 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(true){
            int n=cin.nextInt();
            int x=cin.nextInt();
            if(n==0&&x==0)break;
            int[] arr=new int[n+2];
            for(int i=1;i<=n;i++){
                arr[i]=cin.nextInt();
            }
            int cnt=0;
            arr[n+1]=990630;
            for(int i=1;i<=n;i++){
                System.out.printf("%d ",arr[i]);
                if(cnt==0){
                    if(x<arr[i+1]&&x>=arr[i]){
                        System.out.printf("%d ",x);
                        cnt++;
                    }
                }
            }
            System.out.printf("\n");
        }
        cin.close();
    }
}
