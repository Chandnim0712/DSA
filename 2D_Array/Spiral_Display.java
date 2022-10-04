import java.io.*;
import java.util.*;
public class Spiral_Display{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int te=n*m;
        int count=0;
        while(count<te){
            for(int i=minr;i<=maxr && count<te;i++){
                System.out.print(arr[i][minc]+ " ");
                count++;
            }
            minc++;
            for(int j=minc;j<=maxc && count<te;j++){
                System.out.print(arr[maxr][j]+" ");
                count++;
            }
            maxr--;
            for(int i=maxr;i>=minr && count<te;i--){
                System.out.print(arr[i][maxc] + " ");
                count++;
            }
            maxc--;
            for(int j=maxc;j>=minc && count<te;j--){
                System.out.print(arr[minr][j] +" ");
                count++;
            }
            minr++;
        }
        System.out.println();
    }
}