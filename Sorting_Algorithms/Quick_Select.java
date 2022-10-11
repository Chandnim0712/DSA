import java.util.*;
import java.io.*;
public class Quick_Select{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(QuickSelect(arr,0,arr.length-1,k-1));
    }
    public static int QuickSelect(int[] arr,int lo, int hi,int k){
        if(lo==hi){
            return arr[lo];
        }
        int pivot = arr[hi];
        int pi = partition(arr,pivot,lo,hi);
        if(k>pi){
            return QuickSelect(arr,pi+1,hi,k);
        }else if(k<pi){
            return QuickSelect(arr,lo,pi-1,k);
        }else{
            return arr[pi];
        }
    }
    public static int partition(int[] arr, int pivot, int lo, int hi){
        int i=lo;
        int j=lo;
        while(i<=hi){
            if(arr[i]<=pivot){
                swap(arr,i,j);
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j-1;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}