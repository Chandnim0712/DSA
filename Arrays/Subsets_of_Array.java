import java.util.*;
public class Subsets_of_Array{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        int limit = (int)Math.pow(2,n);
        for(int i=0;i<limit;i++){
            String sbset = "";
            int temp = i;
            for(int j=arr.length-1;j>=0;j--){
                int r = temp % 2;
                temp = temp/2;
                if(r==0){
                    sbset = "-\t" + sbset;
                }else{
                    sbset = arr[j] + "\t" + sbset;
                }
            }
            System.out.println(sbset);
        }
    }
}