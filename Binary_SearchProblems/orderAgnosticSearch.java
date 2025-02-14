package Binary_SearchProblems;

public class orderAgnosticSearch {
    public static void main(String[] args){
        //for asc order
        int[] ascendingArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 4;
        int ans = OAS(ascendingArray, target);
        System.out.println(ans);

        //for desc order
        int[] descendingArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        target = 2;
        ans = OAS(descendingArray,target);
        System.out.println(ans);
    }

    static int OAS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //find wether the array sorted in asc or desc

        boolean isascii = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if (target == arr[mid]){
                return mid;
            }
            if(isascii) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }else if (target < arr[mid])
                {
                    end = mid - 1;
                }
            }
            else{
                if (target < arr[mid]) {
                    start = mid + 1;
                }else if(target > arr[mid])
                {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
