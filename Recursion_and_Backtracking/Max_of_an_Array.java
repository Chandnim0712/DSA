import java.io.*;
import java.util.*;

public class Max_of_an_Array {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int max = max(arr,0);
        System.out.println(max);
    }

    public static int max(int[] arr, int idx){
        if(idx==arr.length - 1){
            return arr[idx];
        }
        int misa = max(arr,idx+1);
        if(misa>arr[idx]){
            return misa;
        }else{
            return arr[idx];
        }
    }
}