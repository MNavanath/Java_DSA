package SortingAlgorithms;

import java.util.Arrays;

public class setMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static  int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return new int[]{nums[index], index+1};
            }
        }
        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int First, int Second){
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }
}
