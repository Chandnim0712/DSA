import java.util.*;
import java.io.*;
public class Merge_Sort{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scn.nextInt();
        }
        int[] ans = mergeSort(a,0,a.length-1);
        print(ans);
    }
    public static int[] mergeSort(int[] arr,int lo, int hi){
        if(lo==hi){
            int[] barr = new int[1];
            barr[0] = arr[lo];
            return barr;
        }
        int mid = (lo + hi) / 2;
        int[] fsh = mergeSort(arr,lo,mid);
        int[] ssh = mergeSort(arr, mid+1, hi);
        int[] ans = mergeTwoSortedArrays(fsh, ssh);
        return ans;
    }
    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int i=0;
        int j=0;
        int k=0;
        int[] ans = new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                ans[k] = a[i];
                i++;
                k++;
            }else{
                ans[k] = b[j];
                j++;
                k++;
            }
        }
        if(i==a.length){
            while(j<b.length){
                ans[k] = b[j];
                j++;
                k++;
            }
        }else{
            while(i<a.length){
                ans[k] = a[i];
                i++;
                k++;
            }
        }
        return ans;
    }
    public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}