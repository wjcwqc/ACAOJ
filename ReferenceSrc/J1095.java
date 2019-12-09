import java.util.Scanner;

public class J1095 {
//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        while(cin.hasNext()){
//            String str = cin.nextLine();
//            char[] arr = str.toCharArray();
//            for (int i = 0; i < arr.length; i++) {
//                if(arr[i]>='a'&&arr[i]<='z'){
//                    arr[i] = (char) (arr[i]-32);
//                }
//            }
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i]);
//            }
//            System.out.println();
//        }
//        cin.close();
//    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            String str=cin.nextLine();
            char[] list =str.toCharArray();
            for(int i=0;i<list.length;i++){
                if(list[i]<='z'&&list[i]>='a'){
                    list[i]-=32;
                }
            }
            for(int i=0;i<list.length;i++){
                System.out.printf("%s",list[i]);
            }
            System.out.println();
        }
    }
}
