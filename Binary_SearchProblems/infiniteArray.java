package Binary_SearchProblems;

public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int k = 10;
        int ans = findingRange(arr, k);
        System.out.println(ans);

    }

    static int findingRange(int[] arr, int target){

        //start from no. of box 2
        int start = 0;
        int end = 1;
        //condition for target lie in the range

        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) *2;
            start = newStart;
        }
        return infinitePos(arr, target, start, end);
    }

    static int infinitePos(int[] arr, int target, int start, int end){
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
