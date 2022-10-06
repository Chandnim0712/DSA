import java.io.*;
import java.util.*;

public class Palindromic_Substrings{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solution(str);
    }

    public static void solution(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                String ss = str.substring(i,j);
                if(isPalindrome(ss) == true){
                    System.out.println(ss);
                }
            }
        }
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<=right){
            char ch1 = str.charAt(left);
            char ch2 = str.charAt(right);
            if(ch1 != ch2){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}