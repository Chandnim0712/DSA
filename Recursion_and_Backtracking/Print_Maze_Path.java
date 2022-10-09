import java.util.*;
import java.io.*;
public class Print_Maze_Path{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        mazePaths(1,1,r,c,"");
    }
    public static void mazePaths(int sr, int sc,int dr, int dc, String ans){
        if(sr > dr || sc > dc){
            return;
        }

        if(sr == dr && sc == dc){
            System.out.println(ans);
            return;
        }

       mazePaths(sr,sc+1,dr,dc,ans + "h");
       mazePaths(sr+1,sc,dr,dc,ans + "v");
    }
}