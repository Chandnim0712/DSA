import java.util.*;
public class SubArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        for(int si=0;si<arr.length;si++){
            for(int li=si;li<arr.length;li++){
                for(int i=si; i<=li;i++){
                    System.out.print(arr[i] + "\t");
                }
                System.out.println();
            }
        }
    }
}