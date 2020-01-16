import java.util.Scanner;

public class J1330 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        while (cn.hasNext()) {
            int[] a = new int[5];
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                a[i] = cn.nextInt();
                sum += a[i];
            }
            int max = 0;
            for (int i = 0; i < 4; i++) {
                if (a[i] == 0)
                    continue;
                int count = 0;
                for (int j = i + 1; j < 5; j++) {
                    if (a[j] == 0)
                        continue;
                    if (a[i] == a[j]) {
                        count++;
                        a[j] = 0;
                    }

                }
                if (count > 0 && count < 3) {
                    int z = (count + 1) * a[i];
                    if (z > max)
                        max = z;
                } else if (count >= 3) {
                    if (max < 3 * a[i])
                        max = 3 * a[i];
                }

            }
            System.out.println(sum - max);
        }
    }
}