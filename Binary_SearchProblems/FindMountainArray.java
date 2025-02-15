package Binary_SearchProblems;

public class FindMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1}; // Example mountain array
        int target = 3;
        int index = findInMountainArray(target, arr);
        System.out.println("Target found at index: " + index);
    }

    public static int findInMountainArray(int target, int[] arr) {
        int peak = peakElement(arr);

        // Try searching in the increasing part
        int firstTry = orderAgnostic(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }

        // If not found, try searching in the decreasing part
        return orderAgnostic(arr, target, peak + 1, arr.length - 1);
    }

    public static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; // 'start' will hold the peak index
    }

    public static int orderAgnostic(int[] arr, int target, int start, int end) {
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
