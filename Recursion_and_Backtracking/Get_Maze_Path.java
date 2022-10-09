import java.util.*;
import java.io.*;
public class Get_Maze_Path{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        ArrayList<String> ans = mazePaths(1,1,r,c);
        System.out.println(ans);
    }
    public static ArrayList<String> mazePaths(int sr, int sc,int dr, int dc){
        if(sr>dr || sc>dc){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }else if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>(); 
            bres.add("");
            return bres;
        }
        ArrayList<String> myPath = new ArrayList<>();
        ArrayList<String> hpath = mazePaths(sr,sc+1,dr,dc);
        ArrayList<String> vpath = mazePaths(sr+1,sc,dr,dc);
        for(String myhpath : hpath){
            myPath.add("h" + myhpath);
        }
        for(String myvpath : vpath){
            myPath.add("v" + myvpath);
        }
        return myPath;
    }
}