package Recursion;

public class BS{
    public static void main(String[] args){
        int arr[] = {1, 3, 4, 5, 8,26, 34, 45, 56, 67, 78, 89, 90, 100};
        int target = 34;
        System.out.println(binarySearch(arr, target, 0, arr.length-1));
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }

        int mid = start + (end-start)/2;

        if (arr[mid] == target){
            return mid;
        }

        if ( target < mid){
            return binarySearch(arr, target, start, mid-1);
        }
        return binarySearch(arr, target, mid+1, end);
    }
}