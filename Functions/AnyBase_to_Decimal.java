import java.util.*;
public class AnyBase_to_Decimal{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b =scn.nextInt();
        int ans = getvalueInDecimal(n,b);
        System.out.println(ans);
    }
    public static int getvalueInDecimal(int n, int b){
        int rv = 0;
        int p = 0;
        while(n>0){
            int r = n%10;
            n=n/10;
            rv += r*((int)Math.pow(b,p));
            p++;
        }
        return rv;
    }
}