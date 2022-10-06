import java.util.*;
public class Power_Logarithmic{
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
        int xkpnb2 = pl(x,n/2);
        int xkpn = xkpnb2*xkpnb2;
        if(n%2==1){
            xkpn = xkpnb2*xkpnb2*x;
        }
        return xkpn;
    }
}