import java.util.*;
import java.io.*;
public class Saddle_Price{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int svj = arr[i][0];
            int psj = 0;
            for(int j=1;j<n;j++){
                if(arr[i][j]<svj){
                    psj = j;
                }
            }
        boolean flag = true;
        for(int k=0;k<n;k++){
            if(arr[k][psj]>svj){
                flag = false;
                break;
            }
        }

        if(flag == true){
            System.out.println(svj);
            return;
        }
        }
    }
}