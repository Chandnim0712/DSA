import java.util.*;
import java.io.*;
public class Selection_Sort{
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        selectionSort(arr);
        print(arr);
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int minidx = i;
            for(int j=i+1;j<n;j++){
                if(isSmaller(arr,j,minidx) == true){
                    minidx = j;
                }
            }
            swap(arr,i,minidx);
        }
    }
    public static boolean isSmaller(int[] arr, int i, int j){
        if(arr[i]<arr[j]){
            return true;
        }else{
            return false;
        }
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}