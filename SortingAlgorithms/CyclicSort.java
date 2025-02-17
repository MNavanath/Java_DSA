package SortingAlgorithms;


import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        int[] arr = {7,5,3,1,6,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int currect = arr[i] - 1;  //
            if(arr[i] != arr[currect]){
                swap(arr, i, currect);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int First, int second){
        int temp = arr[First];
        arr[First] = arr[second];
        arr[second] = temp;

    }
}
