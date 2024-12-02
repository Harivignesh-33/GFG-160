// ? Minimize the Heights II
// !  Day-9
import java.util.Arrays;

class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        
        Arrays.sort(arr);

        // Initial difference between the highest and lowest towers
        int result = arr[n - 1] - arr[0];

        // Iterate through the array and calculate new potential differences
        for (int i = 1; i < n; i++) {
            // Ensure no negative heights
            if (arr[i] - k < 0) continue;

            // Calculate the potential new max and min
            int max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            int min = Math.min(arr[0] + k, arr[i] - k);

            // Update the result with the minimum difference
            result = Math.min(result, max - min);
    }
    return result;
    }
}