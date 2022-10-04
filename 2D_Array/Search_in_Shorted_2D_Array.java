import java.io.*;
import java.util.*;

public class Search_in_Shorted_2D_Array {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int x=scn.nextInt();
        int i=0;
        int j=arr.length-1;
        while(i<arr.length && j>=0){
                if(arr[i][j]==x){
                    System.out.println(i);
                    System.out.println(j);
                    return;
                }else if(arr[i][j]>x){
                    j--;
                }else{
                    i++;
                }
            }
            System.out.println("Not Found");
        }
    }