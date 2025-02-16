package Binary_SearchProblems;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 1, 3, 5};
        int target = 5;
        System.out.println("Pivot Index: " + findPivot(arr));
        System.out.println("Target Index: " + search(arr, target));
    }

    // Method to search for target in rotated sorted array
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If no pivot is found, perform normal binary search
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If target is at pivot
        if (nums[pivot] == target) {
            return pivot;
        }

        // If target is in left half
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // If target is in right half
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    // Standard Binary Search
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // Find Pivot (Index of Max Element)
    public static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
