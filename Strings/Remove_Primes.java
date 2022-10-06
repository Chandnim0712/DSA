import java.io.*;
import java.util.*;

public class Remove_Primes{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }
    public static void solution(ArrayList<Integer> al){
        for(int i=0;i<al.size();i++){
            int val = al.get(i);
            boolean isPrime = IsPrime(val);
            if(isPrime == true){
                al.remove(i);
                i--;
            }
        }
    }
    public static boolean IsPrime(int num){
        boolean IsPrime = true;
        for(int div=2;div*div<=num;div++){
            if(num%div==0){
                IsPrime = false;
                break;
            }
        }
        return IsPrime;
    }
}