import java.util.Scanner;

public class J1203 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        String str = cn.nextLine();
        String regex = " |\\;|\\.";
        String[] data = str.split(regex);
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(""))
                continue;
            System.out.println(data[i]);
        }
    }
}
