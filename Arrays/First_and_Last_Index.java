import java.util.*;
public class First_and_Last_Index{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int lo = 0;
        int hi = arr.length-1;
        int fi=-1;
        int li=-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(data<arr[mid]){
                hi = mid-1;
            }else if(data>arr[mid]){
                lo = mid + 1;
            }else{
                fi = mid;
                hi = mid - 1;
            }
        }
        lo = 0;
        hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(data<arr[mid]){
                hi = mid-1;
            }else if(data>arr[mid]){
                lo = mid + 1;
            }else{
                li = mid;
                lo = mid + 1;
            }
        }
        System.out.println(fi);
        System.out.println(li);
    }
}