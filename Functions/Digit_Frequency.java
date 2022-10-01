import java.util.*;
public class Digit_Frequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = frequencyCount(n,d);
        System.out.println(f);
    }
    public static int frequencyCount(int n, int d){
        int count = 0;
        while(n>0){
            int r = n%10;
            n=n/10;
            if(d==r){
                count++;
            }
        }
        return count;
    }
}