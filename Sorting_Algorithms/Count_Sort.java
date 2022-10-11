import java.util.*;
import java.io.*;
public class Count_Sort{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        countSort(arr,min,max);
        print(arr);
    }
    public static void countSort(int[] arr, int min, int max){
        int range = max-min+1;
        int[] ans = new int[arr.length];
        int[] farr = new int[range];
        for(int i=0;i<arr.length;i++){
            int idx = arr[i] - min;
            farr[idx]++;
        }
        for(int i=1;i<farr.length;i++){
            farr[i] = farr[i] + farr[i-1];
        }
        for(int i=arr.length-1;i>=0;i--){
            int val = arr[i];
            int pos = farr[val - min];
            int idx = pos - 1;
            ans[idx] = val;
            pos--;
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = ans[i];
        }
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}