package SortingAlgorithms;

public class MissingPositiveNumber {

    public static void main(String[] args){
        int[] arr = {-1,2,4,3};
        System.out.println(firstMissingPositive(arr));
    }
    public static  int firstMissingPositive(int[] nums) {
        int i = 0;

        while(i < nums.length){
            int correct  = nums[i] - 1;

            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if (nums[index] != index+1){
                return index+1;
            }
        }
        return nums.length+1;
    }

    static void swap(int[] arr,int First,int Second){
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }
}
