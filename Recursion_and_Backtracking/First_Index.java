import java.util.*;
import java.io.*;
public class First_Index{
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int fi = FirstIndex(arr,0,x);
        System.out.println(fi);
    }
    public static int FirstIndex(int[] arr,int idx,int x){
        if(idx == arr.length){
            return -1;
        }
        if(x==arr[idx]){
            return idx;
        }else{
            int fissa = FirstIndex(arr,idx+1,x);
            return fissa;
        }
    }
}