import java.util.Scanner;

public class Problem_1091 {
//    public static void main(String[] args) {
//        Scanner cin = new Scanner(System.in);
//        String str = cin.next();
//        char[] arr = str.toCharArray();
//        boolean flag = true;
//        for (int i = 0; i < arr.length / 2; i++) {
//            if(arr[i]!=arr[arr.length-1-i]){
//                flag = false;
//            }
//        }
//        if(flag == true){
//            System.out.println("Y");
//        }else{
//            System.out.println("N");
//        }
//        cin.close();
//    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        if(isecho(str)){
            System.out.printf("Y");
        }else{
            System.out.printf("N");
        }
    }

    public static boolean isecho (String str){
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length/2;i++){
            if(chars[i]==chars[chars.length-i-1])continue;
            return false;
        }
        return true;
    }
}
