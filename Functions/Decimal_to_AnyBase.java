import java.util.*;
public class Decimal_to_AnyBase{
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int ans = getValueInBase(n,b);
        System.out.println(ans);
    }
    public static int getValueInBase(int n, int b){
        int rv = 0;
        int pow = 1;
        while(n>0){
            int q = n/b;
            int r = n%b;
            n=n/b;
            rv += r*pow;
            pow *= 10;
        }
        return rv;
    }
}