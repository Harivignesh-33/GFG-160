//  ? Next  permutation

// !  Day-5

class Solution {
    void nextPermutation(int[] arr) {
        // code here
         int n = arr.length;

        // Step 1: Find the first decreasing element from the end
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // Step 2: If such an element exists, find the next greater element
        if (i >= 0) {
            int j = n - 1;
            while (j >= 0 && arr[j] <= arr[i]) {
                j--;
            }
            // Step 3: Swap them
            swap(arr, i, j);
        }

        // Step 4: Reverse the suffix
        reverse(arr, i + 1, n - 1);
    }

    // Helper method to swap two elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper method to reverse part of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
