import java.util.*;
import java.io.*;
public class Radix_Sort{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
    }
    public static void radixSort(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int exp = 1;
        while(exp<=max){
            countSort(arr,exp);
            exp*=10;
        }
    }
    public static void countSort(int[] arr, int exp){
        int[] farr = new int[10];
        for(int i=0;i<arr.length;i++){
            farr[arr[i] / exp % 10]++; // farr[arr[i] - min]++; in count sort
        }
        for(int i=1;i<farr.length;i++){
            farr[i] += farr[i-1];
        }
        int[] ans = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int val = arr[i] / exp % 10;
            int pos = farr[val]; // farr[val - min];
            int idx = pos - 1;
            ans[idx] = arr[i];
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