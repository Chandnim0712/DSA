import java.util.*;
import java.io.*;
public class Print_KPC{
    public static void main (String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printKPC(str,"");
    }
    public static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC(String str, String asf){
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0);
        str = str.substring(1);
        String toBeExpressed = codes[ch - 48];
        for(int i=0;i<toBeExpressed.length();i++){
            char choices = toBeExpressed.charAt(i);
            printKPC(str,choices + asf);
        }
    }
}