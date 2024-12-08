class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        //  Merge sort 
       int n = arr.length;
        int[] temp = new int[n];
        return mergeSortAndCount(arr, temp, 0, n - 1);
    }

    private static int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        int count = 0;

        if (left < right) {
            int mid = (left + right) / 2;

            count+= mergeSortAndCount(arr, temp, left, mid);
            count+= mergeSortAndCount(arr, temp, mid + 1, right);
            count+= mergeAndCount(arr, temp, left, mid,right);
        }

        return count;
    }
     private static int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;    // Starting index for left subarray
        int j = mid + 1; // Starting index for right subarray
        int k = left;    // Starting index to store in temp array
        int count = 0;

        // Merge the two subarrays
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                // Count inversions: all remaining elements in left subarray
                count += (mid - i + 1);
            }
        }

        // Copy remaining elements of left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right subarray
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy sorted elements back into original array
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return count;
    }
}