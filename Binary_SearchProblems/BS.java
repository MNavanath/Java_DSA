package Binary_SearchProblems;

public class BS {
    public static void main(String[] args){
        int[] arr = {-1,0,3,5,45,78};
        int target = 49;

        int ans = findBinSea(arr, target);
        System.out.println(ans);
    }

    static int findBinSea(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (target == arr[mid]){
                return mid;
            }

            else if(target > arr[mid]){
                start = mid + 1;
            }

            else if(target < arr[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }
}
