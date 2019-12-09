import java.util.Scanner;

public class J1112 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for(int i = 0;i<n;i++){
            for(int x = 0;x<9;x++){
                arr[x] = cin.nextInt();
            }
            int[] an=new int[9];
            int b=0,s=8;
            for(int x=8;x>0;x--){
                if(arr[x]<arr[0]){
                    an[b]=arr[x];
                    b++;
                }else{
                    an[s]=arr[x];
                    s--;
                }
            }
            an[b]=arr[0];
//            int l = 0;
//            for(int p = 0;p<9;p++){
//                int x = 8;
//                int y = 1;
//                if(l<5){
//                    if(swap(l,x)){
//                        l=x;
//                    }
//                    x--;
//                }else {
//                    if(swap(l,y)){
//                        l=y;
//                    }
//                    y++;
//                }
//                System.out.printf("l=%d x=%d y=%d\n",l,x,y);
//            }
//            int[] f = {
//                    8,1,7,2,6,3,5,4
//            };
//            for(int x = 0;x<8;x++) {
//                if(l<f[x]) {
//                    if (arr[l] > arr[f[x]]) {
//                        swap(l,f[x]);
//                        l = f[x];
//                    }
//                }else{
//                    if(arr[l] < arr[f[x]]){
//                        swap(l,f[x]);
//                        l = f[x];
//                    }
//                }
//            }
            for(int x = 0;x<9;x++){
                System.out.printf("%d ",an[x]);
            }
            System.out.println();
        }
    }
    public static int[] arr = new int[9];
//    public static boolean swap(int a,int b){
//        boolean rst = false;
//        if(((double)arr[a]-(double)arr[b])/(double)(a-b)<0.0) {
//            int tmp = arr[a];
//            arr[a] = arr[b];
//            arr[b] = tmp;
//            rst = true;
//        }
//        return rst;
//    }
}
