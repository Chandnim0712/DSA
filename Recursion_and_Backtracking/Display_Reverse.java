import java.io.*;
import java.util.*;

public class Display_Reverse {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        displayReverse(arr,0);
    }

    public static void displayReverse(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }
        displayReverse(arr,idx+1);
        System.out.println(arr[idx]);
    }
}