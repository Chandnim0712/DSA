import java.util.*;
import java.io.*;
public class Ring_Rotate{
    public static void main(String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] two = new int[n][m];
        for(int i=0;i<two.length;i++){
            for(int j=0;j<two[0].length;j++){
                two[i][j] = scn.nextInt();
            }
        }

        int s=scn.nextInt();
        int r=scn.nextInt();

        int[] one = get1DFrom2D(two,s);
        rotate(one,r);
        fill2DShellFrom1D(one,two,s);
        display(two);
    }
    public static int[] get1DFrom2D(int[][] two, int s){
        int row = two.length;
        int col = two[0].length;

        int minr = s-1;
        int minc = s-1;
        int maxr = row-s;
        int maxc = col-s;
        int vwcount = maxr - minr + 1; 
        int hwcount = maxc - minc + 1;
        int sz = 2*vwcount + 2*hwcount - 4;

        int[] one = new int[sz];
        int idx = 0;
        for(int i=minr,j=minc;i<=maxr;i++){
            one[idx] = two[i][j];
            idx++;
        }
        minc++;
        for(int i=maxr,j=minc;j<=maxc;j++){
            one[idx] = two[i][j];
            idx++;
        }
        maxr--;
        for(int i=maxr,j=maxc;i>=minr;i--){
            one[idx] = two[i][j];
            idx++;
        }
        maxc--;
        for(int i=minr,j=maxc;j>=minc;j--){
            one[idx] = two[i][j];
            idx++;
        }
        minr++;

        return one;
    }

    public static void rotate(int[] one, int r){
        r = r % one.length;
        if(r<0){
            r+=one.length;
        }
        reverse(one,0,one.length-1-r);
        reverse(one,one.length-r,one.length-1);
        reverse(one,0,one.length-1);
    }

    public static void reverse(int[] one, int left, int right){
        while(left<right){
            int temp = one[left];
            one[left] = one[right];
            one[right] = temp;
            left++;
            right--;
        }
        
    }
    public static void fill2DShellFrom1D(int[] one, int[][] two, int s){
        int row = two.length;
        int col = two[0].length;

        int minr = s-1;
        int minc = s-1;
        int maxr = row-s;
        int maxc = col-s;

        int idx = 0;

        for(int i=minr,j=minc;i<=maxr;i++){
            two[i][j]=one[idx];
            idx++;
        }
        minc++;
        for(int i=maxr,j=minc;j<=maxc;j++){
             two[i][j]=one[idx];
             idx++;
        }
        maxr--;
        for(int i=maxr,j=maxc;i>=minr;i--){
             two[i][j]=one[idx];
            idx++;
        }
        maxc--;
        for(int i=minr,j=maxc;j>=minc;j--){
             two[i][j]=one[idx];
            idx++;
        }
        minr++;
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}