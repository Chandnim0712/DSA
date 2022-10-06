import java.io.*;
import java.util.*;

public class String_With_Difference{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(solution(str));
    }
    public static String solution(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1;i<str.length();i++){
            char present = str.charAt(i);
            char past = str.charAt(i-1);
            int gap = present - past;
            sb.append(gap);
            sb.append(present);
        }
        return sb.toString();
    }
}