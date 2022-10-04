import java.util.*;
import java.io.*;
public class State_of_Wakanda_2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for(int g=0;g<n;g++){
            for(int i=0,j=i+g;j<n;i++,j++){
                System.out.println(arr[i][j]);
            }
        }
        System.out.println("Invalid Input");
    }
}