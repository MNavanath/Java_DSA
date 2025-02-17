package SortingAlgorithms;

import java.util.ArrayList;
import java.util.List;
public class FindAllMissing {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,6,2,3};
        List<Integer> result = findDisappearedNumbers(arr);
        System.out.println(result);

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length;index++){
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }

    static void swap(int[] arr,int First, int Second){
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }

}
