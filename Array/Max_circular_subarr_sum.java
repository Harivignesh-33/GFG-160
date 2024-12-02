// ?  Max Circular Subarray Sum
// !  Day-12

class Solution {

    // Function to implement Kadane's Algorithm
    private int kadane(int arr[]) {
        int max_sum = arr[0];
        int current_sum = arr[0];

        // Iterate over the array to find the maximum subarray sum
        for (int i = 1; i < arr.length; i++) {
            current_sum = Math.max(arr[i], current_sum + arr[i]);
            max_sum = Math.max(max_sum, current_sum);
        }

        return max_sum;
    }

    // Function to find the maximum circular subarray sum
    public int circularSubarraySum(int arr[]) {
        int n = arr.length;

        // Step 1: Find the normal maximum subarray sum using Kadane's algorithm
        int max_normal = kadane(arr);

        // Step 2: Calculate the total sum of the array
        int total_sum = 0;
        for (int i = 0; i < n; i++) {
            total_sum += arr[i];
        }

        // Step 3: Find the minimum subarray sum
        int min_sum = arr[0];
        int current_min_sum = arr[0];
        for (int i = 1; i < n; i++) {
            current_min_sum = Math.min(arr[i], current_min_sum + arr[i]);
            min_sum = Math.min(min_sum, current_min_sum);
        }

        // Step 4: Handle the special case when all elements are negative
        if (total_sum == min_sum) {
            return max_normal;
        }

        // Step 5: Calculate the maximum circular subarray sum
        int max_circular = total_sum - min_sum;

        // Step 6: Return the maximum of normal max subarray sum and circular max subarray sum
        return Math.max(max_normal, max_circular);
    }
}