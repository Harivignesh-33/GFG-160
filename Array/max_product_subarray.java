// ?  Maximum product of the subarray
// !  Day-11

class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
       int max_product = arr[0];
        int min_product = arr[0];
        int result = arr[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is negative, swap max_product and min_product
            if (arr[i] < 0) {
                int temp = max_product;
                max_product = min_product;
                min_product = temp;
            }

            // Update max_product and min_product
            max_product = Math.max(arr[i], max_product * arr[i]);
            min_product = Math.min(arr[i], min_product * arr[i]);

            // Update the global result
            result = Math.max(result, max_product);
        }

        return result;
    }
}