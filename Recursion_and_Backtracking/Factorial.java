import java.util.*;
public class Factorial{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fn = fact(n);
        System.out.println(fn);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int ans = fnm1*n;
        return ans;
    }
}