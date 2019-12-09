import java.util.Scanner;

public class J1198 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        int m=cin.nextInt();
        String[] dna=new String[m];
        String blank =cin.nextLine();
        for(int i=0;i<m;i++){
            dna[i]=cin.nextLine();
        }
        int[] imp=new int[m];
        for(int i=0;i<m;i++){
            imp[i]=renum(dna[i]);
        }
        int[] order=new int[m];
        for(int i=m-1;i>=0;i--){
            int max=0;
            for(int j=0;j<m;j++){
                if(max<=imp[j]){
                    max=imp[j];
                    order[i]=j;
                }
            }
            imp[order[i]]=-1;
        }
//        System.out.println(dna[m]);
        for(int i=0;i<m;i++){
            System.out.println(dna[order[i]]);
        }
    }

    public static int renum(String str) {
        char[] chars=str.toCharArray();
        int cnt=0;
        for(int i=0;i<chars.length-1;i++){
            for(int j=i+1;j<chars.length;j++){
                if(chars[i]>chars[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
