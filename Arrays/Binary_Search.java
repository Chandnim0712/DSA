import java.util.*;
public class Binary_Search{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(d<arr[mid]){
                hi = mid - 1;
            }else if(d>arr[mid]){
                lo = mid + 1;
            }else{
                System.out.println(mid);
                return;
            }
        }
        System.out.println(-1);
    }
}