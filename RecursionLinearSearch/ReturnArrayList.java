package RecursionLinearSearch;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6,7,3,5,2,3,6};
        int target = 3;
        ArrayList<Integer> mylist = new ArrayList<>();
        System.out.println(findAllIndex(arr,target,0,mylist));
    }

    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return findAllIndex(arr,target,index+1,list);
    }
}
