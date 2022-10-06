import java.io.*;
import java.util.*;

public class Toggle_Optica_Document{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(toggleCase(str));
    }
    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);

            if(ch >='A' && ch <= 'Z'){
            char lc = (char)(ch + 'a' - 'A');
            sb.setCharAt(i,lc);
            }else {
                char uc = (char)(ch + 'A' - 'a');
                sb.setCharAt(i,uc);
            }
        }

        return sb.toString();
    }
}