// ? Rotate an array

// !  Day-4

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        
        // Handle cases where d is greater than n
        d = d % n;
        
        reverse(arr, 0, n - 1);       //  Reverse the entire array
        reverse(arr, 0, n - d - 1);  // Reverse the first n - d elements
        reverse(arr, n - d, n - 1); // Reverse the last d elements
    }

    // function to reverse a portion of the array
    static void reverse(int arr[], int first, int last) {
        while (first < last) {
            // Swap elements from first to last
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }
}
