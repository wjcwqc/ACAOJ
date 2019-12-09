import java.util.Scanner;

public class J1145 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] num = new int[26];
        while (cin.hasNext()){
            String str = cin.nextLine();
            char[] arr= str.toCharArray();
            outer:for(int i=0;i<arr.length;i++){
                for(char a='a';a<='z';a++){
                    if(arr[i]==a||arr[i]==a-32){
                        num[a-97]++;
                        break;
                    }
                    if(arr[i]=='#')break outer;
                }
            }
        }
        {
            char a = 'a';
            for (int i = 0; i < 26; i++) {
                System.out.println(a + " " + num[i]);
                a++;
            }
        }
    }
}
