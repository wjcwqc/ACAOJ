import java.util.Scanner;

public class J1256 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int t= cn.nextInt();
        while(t-->0){
            int n = cn.nextInt();
            int[] z = new int[n];
            for(int i =0;i<n;i++){
                z[i] = cn.nextInt();
            }
            for(int i =0;i<n;i++){
                int count = 0;
                if(z[i]<0) continue;
                for(int j = i+1 ;j<n;j++){
                    if(z[j]<0) continue;
                    if(z[i]==z[j]){
                        count++;
                        z[j] = -1;
                    }
                }
                if(count%2==0) {
                    System.out.println(z[i]);
                    break;
                }
            }
        }
    }
}