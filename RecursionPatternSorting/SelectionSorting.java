package RecursionPatternSorting;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] num = {1,4,3,6};
        sort(num,num.length,0,0);
        System.out.println(Arrays.toString(num));
    }

    static void sort(int[] arr,int r, int c,int max ){
        if(r == 0){
            return;
        }

        if(c < r) {
            if (arr[c] > arr[max]) {
                sort(arr, r, c + 1, c);
            } else {
                sort(arr, r, c + 1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            sort(arr,r-1,0,0);
        }
    }
}
