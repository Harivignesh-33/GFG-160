class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
        if (k > n) return -1; 
        
        int low = Integer.MIN_VALUE, high = 0;
        for (int pages : arr) {
            low = Math.max(low, pages);
            high += pages;
        }
        
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isFeasible(arr, n, k, mid)) {
                result = mid; 
                high = mid - 1; 
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    
    private static boolean isFeasible(int[] arr, int n, int k, int maxPages) {
        int studentCount = 1, pagesAllocated = 0;
        
        for (int pages : arr) {
            if (pagesAllocated + pages > maxPages) {
                studentCount++; 
                pagesAllocated = pages; 
                
                if (studentCount > k) return false; 
            } else {
                pagesAllocated += pages;
            }
        }
        return true; 
    }
}