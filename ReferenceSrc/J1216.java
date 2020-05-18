import java.util.Scanner;

public class J1216 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        Changemoney(a);
        cin.close();
    }

    public static void Changemoney(int money) {
        //面值
        int[] value = {100, 50, 20, 10, 5, 2, 1};
        //对应找零张数
        for (int i = 0; i < value.length; i++) {
            while (money >= value[i]) {
                System.out.println(value[i]);
                money -= value[i];
            }
        }
    }
}
