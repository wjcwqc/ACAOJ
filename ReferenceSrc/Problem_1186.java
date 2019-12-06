import java.util.Scanner;

public class Problem_1186 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String[] dio = {"0000","0001","0010","0011","0100","0101","0110","0111",
                            "1000","1001","1010","1011","1100","1101","1110","1111"};

        char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (cin.hasNext()){
            String str = cin.nextLine();
            char[] arr = str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < hex.length; j++) {
                    if(arr[i]==hex[j]){
                        System.out.print(dio[j]);
                    }
                }
            }
            System.out.println();
        }
    }
}
