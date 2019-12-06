import java.util.Scanner;

public class Problem_1182 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        while(m-->0){
            String str = cin.next();
            char[] arr = str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>='A'&&arr[i]<='Z'){
                    arr[i] = (char) (arr[i]+32);
                }else if(arr[i]>='a'&&arr[i]<='z'){
                    arr[i] = (char) (arr[i]-32);
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
        cin.close();
    }
}
