import java.util.*;
import java.io.*;
public class Print_Stair_Path{
    public static void main (String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printStairPaths(n,"");
    }

    public static void printStairPaths(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }if(n<0){
            return;
        }
        printStairPaths(n-1,"1" + ans);
        printStairPaths(n-2,"2" + ans);
        printStairPaths(n-3,"3" + ans);
    }
}