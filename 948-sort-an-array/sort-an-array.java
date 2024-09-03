class Solution {
    public int[] sortArray(int[] nums) {
        mergeSortInPlace(nums, 0, nums.length - 1);
        return nums;
    }

    // In-place merge sort function
    static void mergeSortInPlace(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            // Recursively sort the first and second halves
            mergeSortInPlace(arr, low, mid);
            mergeSortInPlace(arr, mid + 1, high);

            // Merge the sorted halves
            mergeInPlace(arr, low, mid, high);
        }
    }

    // Merge function to combine two sorted halves into the original array
    static void mergeInPlace(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        // Merge the two halves into the temporary array
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the first half (if any)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the second half (if any)
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        System.arraycopy(temp, 0, arr, low, temp.length);

    }
}