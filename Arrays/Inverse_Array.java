import java.util.*;
public class Inverse_Array{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int[] inv = inverse(arr);
        print(inv);
    }
    public static int[] inverse(int[] arr){
        int[] inv = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            inv[arr[i]] = i;
        }
        return inv;
    }
    public static void print(int[] inv){
        StringBuilder sb = new StringBuilder();
        for(int val : inv){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }
}