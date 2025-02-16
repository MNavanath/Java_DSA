package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {1,2,4,2,5,6,7,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swaped;
        for(int i =0; i < arr.length;i++){
            swaped = false;
            for(int j = 1; j < arr.length-i;j++){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }
    }
}
