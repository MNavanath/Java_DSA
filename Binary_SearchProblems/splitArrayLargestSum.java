package Binary_SearchProblems;

public class splitArrayLargestSum {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for(int i = 0; i < nums.length-1; i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }

        while(start < end){
            //try for find potential middle as possible
            int mid = start + (end - start) / 2;

            //calculate how many pieces you can divide with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num: nums){
                if(num + sum > mid){
                    sum = num;
                    pieces ++;
                }else{
                    sum += num;
                }
            }
            if(pieces > m){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}
