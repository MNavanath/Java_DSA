package SortingAlgorithms;

import java.security.cert.CertStoreSpi;
import java.util.Arrays;

public class MissingNumbers {
    public static void main(String[] args) {

        int[] arr = {0,1,2,3,4,5};
        int MissingNumber = missingNumber(arr);
        System.out.println(MissingNumber);


    }
    public static int missingNumber(int[] nums) {
        int i = 0;

        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int j = 0;j<nums.length;j++){
            if(nums[j] != j) {
                return j;
            }
        }
        return nums.length;

    }

    static void swap(int[] arr,int First,int Second){
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }
}
