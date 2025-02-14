package Binary_SearchProblems;

public class cielingNumber {
    public static void main(String[] args){
        int arr[] = {10,20,30};
        int target = 29;
        System.out.println(cieling(arr, target));
    }

    static int cieling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
