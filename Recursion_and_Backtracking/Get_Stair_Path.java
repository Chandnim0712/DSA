import java.util.*;
import java.io.*;
public class Get_Stair_Path{
    public static void main (String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n){
        if(n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> getPathFromnm1 = getStairPaths(n-1);
        ArrayList<String> getPathFromnm2 = getStairPaths(n-2);
        ArrayList<String> getPathFromnm3 = getStairPaths(n-3);
        ArrayList<String> getPathFromN = new ArrayList<>();

        for(String getPathFromNminus1 : getPathFromnm1){
            String newPathFromN = "1" + getPathFromNminus1;
            getPathFromN.add(newPathFromN);
        }
        for(String getPathFromNminus2 : getPathFromnm2){
            String newPathFromN = "2" + getPathFromNminus2;
            getPathFromN.add(newPathFromN);
        }
        for(String getPathFromNminus3 : getPathFromnm3){
            String newPathFromN = "3" + getPathFromNminus3;
            getPathFromN.add(newPathFromN);
        }
        return getPathFromN;
    }
}