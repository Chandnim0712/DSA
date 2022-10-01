import java.util.*;
public class Find_Element{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int fa = -1;
        for(int i=0;i<n;i++){
            if(d==arr[i]){
                fa = i;
                break;
            }
        }
        System.out.println(fa);
    }
}