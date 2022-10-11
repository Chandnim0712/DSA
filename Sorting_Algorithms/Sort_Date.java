import java.util.*;
import java.io.*;
public class Sort_Date{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            String str = scn.next();
            arr[i] = str;
        }
        sortDate(arr);
        print(arr);
    }
    public static void sortDate(String[] arr){
        countSort(arr,1000000,100,32);
        countSort(arr,10000,100,13);
        countSort(arr,1,10000,2051);
    } 
    public static void countSort(String[] arr,int div,int mod, int range){
        String[] ans = new String[arr.length];
        int[] farr = new int[range];
        for(int i=0;i<arr.length;i++){
            farr[Integer.parseInt(arr[i],10) / div % mod]++;
        }
        for(int i=1;i<farr.length;i++){
            farr[i] += farr[i-1];
        }
        for(int i=arr.length-1;i>=0;i--){
           int pos = farr[Integer.parseInt(arr[i],10) / div % mod] - 1;
            ans[pos] = arr[i];
            farr[Integer.parseInt(arr[i],10) / div % mod]--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = ans[i];
        }
    }
    public static void print(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}