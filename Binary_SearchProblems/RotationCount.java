package Binary_SearchProblems;

public class RotationCount {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 1, 2, 3};
        int ans = rotationCount(arr);
        System.out.println(ans+1);

    }

    static int rotationCount(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] < arr[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
