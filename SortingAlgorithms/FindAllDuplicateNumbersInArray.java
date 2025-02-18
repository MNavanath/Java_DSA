package SortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNumbersInArray {
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] nums) {
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
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int First, int Second){
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }
}
