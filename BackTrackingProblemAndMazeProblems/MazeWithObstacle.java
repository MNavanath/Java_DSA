package BackTrackingProblemAndMazeProblems;

import java.util.ArrayList;

public class MazeWithObstacle {
    public static void main(String[] args) {

        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}

        };
//        System.out.println(obsttcleStopPrintPath("",board, 0,0));
//        System.out.println(obsttcleStopPrintAllPath("",board, 0,0));

        allPath("",board,0,0);
    }

    static ArrayList<String> obsttcleStopPrintPath(String p,boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(!maze[r][c]){
            return ans;
        }

        if(r < maze.length-1){
            ans.addAll(obsttcleStopPrintPath(p+'D',maze,r+1,c));
        }

        if(c < maze[0].length-1){
            ans.addAll(obsttcleStopPrintPath(p+'R',maze,r,c+1));
        }

        return ans;
    }


    //All paths
    /*static ArrayList<String> obsttcleStopPrintAllPath(String p,boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(!maze[r][c]){
            return ans;
        }

        if(r < maze.length-1){
            ans.addAll(obsttcleStopPrintAllPath(p+'D',maze,r+1,c));
        }

        if(c < maze[0].length-1){
            ans.addAll(obsttcleStopPrintAllPath(p+'R',maze,r,c+1));
        }

        if(r > 0){
            ans.addAll(obsttcleStopPrintAllPath(p+'R',maze,r-1,c));
        }

        if(c > 0){
            ans.addAll(obsttcleStopPrintAllPath(p+'R',maze,r,c-1));
        }

        return ans;
    }*/

    //with Backtracking
    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPath(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length - 1) {
            allPath(p + 'R', maze, r, c+1);
        }

        if (r > 0) {
            allPath(p + 'U', maze, r-1, c);
        }

        if (c > 0) {
            allPath(p + 'L', maze, r, c-1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }
}
