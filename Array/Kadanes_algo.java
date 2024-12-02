// ? Kadane's Algorithm
// !  Day-10
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        
        int max_sum = arr[0]; // Initialize max_sum with the first element
        int current_sum = arr[0]; // Initialize current_sum with the first element

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update current_sum to either the current element itself or current_sum + element
            current_sum = Math.max(arr[i], current_sum + arr[i]);
            
            // Update max_sum if current_sum is greater
            max_sum = Math.max(max_sum, current_sum);
        }

        return max_sum;
    }
}
