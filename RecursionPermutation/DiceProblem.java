package RecursionPermutation;

import java.util.ArrayList;

public class DiceProblem {
    public static void main(String[] args) {
        dice("",4);
        System.out.println(diceList("",4));
        diceFace("",4,8);
        System.out.println(diceListFace("",4,8));

    }

    static void dice(String p, int target){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i<= 6 && i<=target; i++){
            dice(p+i,target-i);
        }
    }

    //return all values in list
    static ArrayList<String> diceList(String p, int target){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i<= 6 && i<=target; i++){
            ans.addAll(diceList(p+i,target-i));
        }
        return ans;
    }

    //use diceFace

    static void diceFace(String p, int target,int Face){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i<= Face && i<=target; i++){
            diceFace(p+i,target-i,Face);
        }
    }

    //return the value in list for problem : diceFace

    static ArrayList<String> diceListFace(String p, int target,int Face){
        if (target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i<= Face && i<=target; i++){
            ans.addAll(diceListFace(p+i,target-i,Face));
        }
        return ans;
    }
}
