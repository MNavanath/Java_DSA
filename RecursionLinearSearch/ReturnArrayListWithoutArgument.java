package RecursionLinearSearch;

import java.util.ArrayList;


//dont use this approach its not effcient

public class ReturnArrayListWithoutArgument {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,6,7,3,5,2,3,6};
        int target = 3;
        ArrayList<Integer> mylist = new ArrayList<>();
        System.out.println(findAllIndex(arr,target,0));
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }

        //this will contain answer fort that function call only
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ans =  findAllIndex(arr,target,index+1);
        list.addAll(ans);
        return list;
    }
}
