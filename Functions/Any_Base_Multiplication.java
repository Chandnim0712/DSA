import java.util.*;
public class Any_Base_Multiplication{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        int ans = getValue(n1,n2,b);
        System.out.println(ans);
    }
    public static int getValue(int n1, int n2, int b){
        int rv = 0;
        int c = 0;
        int p = 1;
        while(n2>0){
            int d2 = n2%10;
            n2 = n2/10;
            int pwd = pwdsd(n1,d2,b);
            rv = getSum(rv,p*pwd,b);
            p*=10;
        }
        return rv;
    }
    public static int pwdsd(int n1, int d2, int b){
        int c=0;
        int p=1;
        int rv=0;
        while(n1>0||c>0){
            int d1=n1%10;
            n1=n1/10;
            int d = d1*d2+c;
            c=d/b;
            d=d%b;
            rv+=d*p;
            p*=10;
        }
        return rv;
    }
    public static int getSum(int n1, int n2, int b){
        int c=0;
        int p=1;
        int rv=0;
        while(n1>0||n2>0||c>0){
            int d1=n1%10;
            n1=n1/10;
            int d2=n2%10;
            n2=n2/10;
            int d= d1+d2+c;
            c=d/b;
            d=d%b;
            rv+=d*p;
            p*=10;
        }
        return rv;
    }
}