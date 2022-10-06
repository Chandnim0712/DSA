import java.util.*;
public class Power_Linear{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = pl(x,n);
        System.out.println(ans);
    }
    public static int pl(int x,int n){
        if(n==0){
            return 1;
        }
        int xkpnm1 = pl(x,n-1);
        int xkpn = x*xkpnm1;
        return xkpn;
    }
}