import java.io.*;
import java.util.*;

public class String_Permutation{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
    }
    public static void solution(String str){
        int n = str.length();
        int f = factorial(n);
        for(int i=0;i<f;i++){
            StringBuilder sb = new StringBuilder(str);
            int temp = i;
            for(int div = n;div>=1;div--){
                int q = temp/div;
                int r = temp%div;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }
    public static int factorial(){
        int val = 1;
        for(int f=2;f<=n;f++){
            val = val*f;
        }
        return val;
    }
}