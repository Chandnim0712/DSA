import java.util.*;
public class Matrix_Multiplication{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int[][] arr1 = new int[n1][n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr1[i][j] = scn.nextInt();
            }
        }
        int m1 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] arr2 = new int[m1][m2];
        for(int i=0;i<m1;i++){
            for(int j=0;j<m2;j++){
                arr2[i][j] = scn.nextInt();
            }
        }
        if(n2!=m1){
            System.out.println("Invalid input");
        }
        int[][] prdt = new int[n1][m2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                int sum = 0;
                for(int k=0;k<n2;k++){
                    sum += arr1[i][k]*arr2[k][j];
                }
                prdt[i][j] = sum;
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<m2;j++){
                System.out.print(prdt[i][j] + " ");
            }
            System.out.println();
        }
    }
}