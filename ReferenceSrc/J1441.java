import java.util.*;

public class J1441 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str1=cin.nextLine();
        String str2=cin.nextLine();
        String str3=str1.toLowerCase();
        String str4=str2.toLowerCase();
        String regex="[\\pP\\s+]";
        String strs[]=str4.split(regex);
        int k=0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].equals(str3)){
                k++;
            }
        }
        System.out.println(k);
        cin.close();
    }
}
