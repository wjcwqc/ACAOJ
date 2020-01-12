import java.util.Scanner;

public class J1180 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int[] n = new int[5];
        for(int i =0;i<5;i++){
            n[i] = cn.nextInt();
        }
        int min = n[0],max = n[0];
        for(int i =0;i<5;i++){
            if(min>n[i]) min = n[i];
            if(max<n[i]) max = n[i];
        }
        System.out.println(min+" "+max);
    }
}
