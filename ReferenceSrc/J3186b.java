import java.util.*;

public class J3186b {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int X=cin.nextInt();
        double S=cin.nextDouble();
        int i = zhifu(X, S);

        System.out.println(i);

    }

    private static int zhifu(int X, double S) {
        double a=0;
        if(X==1){
            if(S<=2.5){
                a=8;
            }
            else if(2.5<S&&S<=15.0){
                a=8+(S-2.50)*1.4;
            }
            else{
                a=8+(S-2.50)*1.4+(S-15)*2.1;
            }
        }
        if(X==2){
            if(S<=2.5){
                a=9;
            }
            else if(2.5<S&&S<=15.0){
                a=9+(S-2.50)*1.4;
            }
            else{
                a=9+(S-2.50)*1.4+(S-15)*2.1;
            }
        }
        a=a+0.5;
        return (int)a;
    }


}