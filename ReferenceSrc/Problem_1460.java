import java.util.*;
public class Problem_1460 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t=cin.nextInt();
        for(int i=1;i<=t;i++){
            String str=cin.next();
            if(str.indexOf("13")==-1){
                System.out.println("Case #"+i+": Yes, I like it!");
            }
            else{
                System.out.println("Case #"+i+": No, it's terrible!");
            }
        }
        cin.close();
    }
}
