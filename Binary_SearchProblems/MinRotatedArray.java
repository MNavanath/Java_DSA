package Binary_SearchProblems;

public class MinRotatedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,1,2,3};
        int ans = minEle(arr);
        System.out.println(ans);
    }

    static int minEle(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] < arr[end]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return arr[start];
    }
}
