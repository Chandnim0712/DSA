import java.util.*;
public class Rotate_Array{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        rotate(arr,k);
        print(arr);
    }
    public static void rotate(int[] arr, int k){
        k=k%arr.length;
        if(k<0){
            k=k+arr.length;
        }
        reverse(arr,0,arr.length-k-1);
        reverse(arr,arr.length-k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void reverse(int[] arr,int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void print(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int val : arr){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }
}