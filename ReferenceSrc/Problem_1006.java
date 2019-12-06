import java.util.Scanner;
import java.util.regex.Pattern;
public class Problem_1006 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()){
            String ip = cin.nextLine();
            String regex = "(2[5][0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})";
            Pattern pattern = Pattern.compile(ip);
            boolean c = ip.matches(regex);
            if(c == true) {
                System.out.println("Y");
            }
            else{
                System.out.println("N");
            }
        }
        cin.close();
    }
}
