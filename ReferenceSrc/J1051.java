//import java.awt.*;
//import java.util.LinkedList;
//import java.util.Scanner;
//
//public class Problem_1051 {
//    public static void main(String[] args) {
//        while(cin.hasNext()){
//            int n=cin.nextInt();
//            int m=cin.nextInt();
//            System.out.println(out(n,m));
//        }
//    }
//    static Scanner cin = new Scanner(System.in);
//    public static int out(int n,int m){
//        List<Integer> dataList = new LinkedList<Integer>();
//        for(int i= 0;i<n;i++){
//            dataList.add(new Integer(i+1));
//        }
//        int index = -1;
//        while(dataList.getSize() > 1){
//            index = (index +m)%dataList.getSize();
//            ((LinkedList) dataList).remove(index--);
//        }
//        return ((Integer)dataList.get(0).intValue());
//    }
//}

import java.util.LinkedList;
import java.util.Scanner;

public class J1051 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            LinkedList<Integer> q = new LinkedList<Integer>();
            for (int i = 1; i <= n; i++) {
                q.add(i);
            }
            int start = 0;
            for (int i = 0, j = q.size(); i < j - 1; i++) {
                start = (start + m - 1) % q.size();
                q.remove(start);
            }
            System.out.println(q.getFirst());
        }
    }

}
