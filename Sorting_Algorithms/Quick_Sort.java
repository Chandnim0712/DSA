import java.io.*;
import java.util.*;
public class Quick_Sort{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
    QuickSort(arr,0,arr.length-1);
    print(arr);
    }
    public static void QuickSort(int[] arr, int lo, int hi){
        if(lo>=hi){ // equal means elements are remaining
            return;
        }
        int pivot = arr[hi];
        int pi = partition(arr,pivot,lo,hi);
        QuickSort(arr,lo,pi - 1);
        QuickSort(arr,pi+1, hi);
    }
    public static int partition(int[] arr,int pivot, int lo, int hi){
        int i= lo;
        int j= lo;
        while(i<=hi){
            if(arr[i]>pivot){
                i++;
            }else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        return j-1;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}