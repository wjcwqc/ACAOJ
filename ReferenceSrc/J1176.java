import java.util.Scanner;

public class J1176 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        String[] str = new String[1001];
        int i =0;
        while(cn.hasNext()){
            str[i] = cn.next();
            i++;
        }
        int counts = 0;
        for(int k = 0;k<i;k++){
            int numberCounts = 0;
            for(int j = 0 ;j<str[k].length();j++){
                if(str[k].charAt(j)=='4')
                    break;
                else if(str[k].charAt(j)=='6'||str[k].charAt(j)=='8'){
                    numberCounts++;
                }
            }
            if(numberCounts>=5){
                System.out.println(str[k]);
                counts++;
            }
        }
        System.out.println(counts);
    }
}
