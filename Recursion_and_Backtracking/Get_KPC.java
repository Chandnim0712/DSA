import java.util.*;
import java.io.*;
public class Get_KPC{
    public static void main (String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }
    public static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        String code = codes[ch-48];
        for(int i=0;i<code.length();i++){
            char chCode = code.charAt(i);
            for(String rstr : rres){
                mres.add(chCode + rstr);
            }
        }
        return mres;
    }
}