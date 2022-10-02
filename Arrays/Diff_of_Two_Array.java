import java.util.*;
public class Diff_of_Two_Array{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i] = scn.nextInt();
        }
        int[] Diff = new int[n2]; 
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=Diff.length-1;
        int c=0;
        while(k>=0){
            int d = arr2[j] - c;
            if(i>=0){
                d = d - arr1[i];
            }
            if(d<0){
                c=1;
                d=d+10;
            }else{
                c=0;
            }
            Diff[k] = d;
            i--;
            j--;
            k--;
        }
        int idx = 0;
        while(idx < Diff.length){
            if(Diff[idx]!=0){
                break;
            }else{
                idx++;
            }
        }
        while(idx<Diff.length){
            System.out.println(Diff[idx]);
            idx++;
        }
    }
}