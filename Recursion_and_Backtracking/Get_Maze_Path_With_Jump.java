import java.util.*;
import java.io.*;
public class Get_Maze_Path_With_Jump{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        ArrayList<String> ans = mazePaths(0,0,r-1,c-1);
        System.out.println(ans);
    }
    public static ArrayList<String> mazePaths(int sr, int sc,int dr, int dc){
        if(sr>dr||sc>dc){
            return new ArrayList<>();
            }

        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");         
            return bres;
        }
       ArrayList<String> path = new ArrayList<>();
       for(int jumps = 1;jumps<=dc-sc;jumps++){
            ArrayList<String> hpath = mazePaths(sr,sc+jumps,dr,dc);
            for(String myhpath : hpath){
                path.add("h" + jumps + myhpath);
            }
        }
       for(int jumps=1;jumps<=dr-sr;jumps++){
        ArrayList<String> vpath = mazePaths(sr+jumps,sc,dr,dc);
        for(String myvpath : vpath){
            path.add("v" + jumps + myvpath);
        }
       }
       for(int jumps=1;jumps <= dr-sr && jumps<=dc-sc;jumps++){
        ArrayList<String> dpath = mazePaths(sr+jumps,sc+jumps,dr,dc);
        for(String mydpath : dpath){
            path.add("d" + jumps + mydpath);
        }
       }
       return path;
    }
}