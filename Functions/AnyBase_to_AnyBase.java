import java.util.*;
public class AnyBase_to_AnyBase{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int ans = getValue(n,b1,b2);
        System.out.println(ans);
    }
    public static int getValue(int n, int b1, int b2){
        int dec = AnyBase_to_Decimal(n,b1);
        int dn = Decimal_to_AnyBase(dec,b2);
        return dn;
    }
    public static int AnyBase_to_Decimal(int n, int b){
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
    public static int Decimal_to_AnyBase(int n, int b){
        int rv = 0;
        int pow = 1;
        while(n>0){
            int r = n%b;
            n=n/b;
            rv += r*pow;
            pow *= 10;
        }
        return rv;
    }
}