import java.util.Scanner;

public class J1033 {
//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        int n = cin.nextInt();
//        int sum = 0;
//        for (int i = 1; ; i++) {
//            sum += i*i*i;
//            if(sum>n){
//                System.out.println(i-1);
//                break;
//            }
//        }
//        cin.close();
//    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        int m=0;
        int i =0;
        while(m<=n){
            i++;
            m+=i*i*i;
        }
        System.out.printf("%d",i-1);
    }
}
