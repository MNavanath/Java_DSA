package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr){
        if(arr.length == 1 ){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] First,int[] Second){
        int[] mix = new int[First.length + Second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < First.length && j < Second.length) {
            if (First[i] < Second[j]) {
                mix[k] = First[i];
                i++;
            } else {
                mix[k] = Second[j];
                j++;
            }
            k++;
        }


        while (i < First.length) {
            mix[k] = First[i];
            i++;
            k++;
        }



        while (j < Second.length) {
            mix[k] = Second[j];
            j++;
            k++;
        }

        return mix;

    }
}
