import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class J1045 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        //TODO
        Set set = new HashSet();
        for(int i = 0; i <= 4; i ++){
            for(int j = 0; j <= 3; j ++){
                int tmp = 3 * i + 5 * j;
                set.add(tmp);
            }
        }
        //排除0的情况
        int ans = set.size() - 1;
        System.out.println(ans);
        cin.close();
    }
}
