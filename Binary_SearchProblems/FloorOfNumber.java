package Binary_SearchProblems;

public class FloorOfNumber {
    public static void main(String[] args){
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 18, 20};
        int target = 0;
        int ans = floor(Array, target);
        System.out.println(ans);
    }

    //return the index of greater one <= target
    static int floor(int[] arr, int target){
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
        return end;
    }

}
