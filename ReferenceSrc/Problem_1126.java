
import java.util.Scanner;

public class Problem_1126 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            String str = cin.next();
            String str1 = str.toLowerCase();
            char[] arr = str1.toCharArray();
            String max = "(max)";
            char maxLetter = 'a';
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>maxLetter){
                    maxLetter = arr[i];
                }
            }
            String Max =maxLetter+"";
            String replace = str.replace(Max, Max + max);
            System.out.println(replace);
        }
        cin.close();
    }
}
