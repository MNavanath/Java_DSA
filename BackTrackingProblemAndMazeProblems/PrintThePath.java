package BackTrackingProblemAndMazeProblems;

import java.util.ArrayList;

public class PrintThePath {
    public static void main(String[] args) {

        PrintPath("",3,3);
        System.out.println(PrintPathRet("",3,3));
        System.out.println(PrintPathRetDig("",3,3));
    }

    static void PrintPath(String p,int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            PrintPath(p+'D',r-1,c);
        }

        if(c > 1){
            PrintPath(p+'R',r,c-1);
        }
    }

    //Return in list
    static ArrayList<String> PrintPathRet(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        if(r > 1){
            ans.addAll(PrintPathRet(p+'D',r-1,c));
        }

        if(c > 1){
            ans.addAll(PrintPathRet(p+'R',r,c-1));
        }
        return ans;
    }


    //printpath digonally
    static ArrayList<String> PrintPathRetDig(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }


        ArrayList<String> ans = new ArrayList<>();

        if(r > 1 && c > 1){
            ans.addAll(PrintPathRetDig(p+'D',r-1,c-1));
        }
        if(r > 1){
            ans.addAll(PrintPathRetDig(p+'V',r-1,c));
        }

        if(c > 1){
            ans.addAll(PrintPathRetDig(p+'H',r,c-1));
        }
        return ans;
    }
}
