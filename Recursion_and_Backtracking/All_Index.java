import java.util.*;
import java.io.*;
public class All_Index{
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int[] ans = AllIndex(arr,x,0,0);

        if(ans.length == 0){
            System.out.println("NO OUTPUT");
            return;
        }
        
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] AllIndex(int[] arr,int x,int idx,int fsf){
        if(idx == arr.length){
            return new int[fsf];
        }
        int[] iarr;
        if(arr[idx]==x){
            iarr = AllIndex(arr,x,idx+1,fsf+1);
            iarr[fsf] = idx;
        }else{
            iarr = AllIndex(arr,x,idx+1,fsf);
        }
        return iarr;
    }
}