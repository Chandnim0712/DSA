import java.util.*;
import java.io.*;
public class Sort_012{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        sort(arr);
        print(arr);
    }
    public static void sort(int[] arr){
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]==0){
                swap(arr,i,j);
                i++;
                j++;
            }else if(arr[i]==1){
                i++;
            }
        }
    }
    public static void swap(int[] arr,int i, int j){
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
