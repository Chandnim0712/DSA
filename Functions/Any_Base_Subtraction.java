import java.util.*;
public class Any_Base_Subtraction{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        int ans = getDiff(n1,n2,b);
        System.out.println(ans);
    }
    public static int getDiff(int n1, int n2, int b){
        int rv = 0;
        int carry = 0;
        int tp = 1;
        while(n2>0){
            int d1 = n1%10;
            n1=n1/10;
            int d2 = n2%10;
            n2=n2/10;
            int d = d2 - carry - d1;
            if(d<0){
                carry = 1;
                d=d+b;
            }else{
                carry = 0;
            }
            rv += d*tp;
            tp*=10;
        }
        return rv;
    }
}