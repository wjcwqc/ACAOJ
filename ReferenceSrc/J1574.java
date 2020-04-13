import java.util.*;

class Java1574 {

    static class Block {
        int weight;
        int height;

        Block(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        while (N-- > 0) {
            int M = cin.nextInt();
            List<Block> list = new ArrayList<>();
            while (M-- > 0) {
                int m = cin.nextInt(), n = cin.nextInt();
                list.add(new Block(m, n));
            }
            int X = cin.nextInt();
            System.out.println(Judge(list, X));
        }
    }

    private static int Judge(List<Block> list, int x) {
        List<Block> T = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int sum = 0, j = i;
            Block r1 = list.get(i);
            while (sum < x && j < list.size()) {
                sum += list.get(j).weight;
                j++;
            }
            if (sum >= x) {
                for (int m = i; m < j; m++) {
                    if (list.get(m).weight > r1.weight)
                        r1 = list.get(m);
                }
                T.add(r1);
            }
        }
        Block T1 = T.get(0);
        for (Block re : T) {
            if (T1.height < re.height)
                T1 = re;
        }
        return T1.height + x;
    }
}
