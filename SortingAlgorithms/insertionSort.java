package SortingAlgorithms;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,8,9,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
