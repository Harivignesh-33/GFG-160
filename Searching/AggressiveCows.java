class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int low = 1; 
        int high = stalls[stalls.length - 1] - stalls[0];
        int result = 0;
        
        while (low <= high) {
            int mid = (low + high) / 2; 
            
            if (canPlaceCows(stalls, k, mid)) {
                result = mid;   
                low = mid + 1;  
            } else {
                high = mid - 1; 
            }
        }
        
        return result; 
    }
    
    // Helper function 
    private static boolean canPlaceCows(int[] stalls, int k, int distance) {
        int cowsPlaced = 1; 
        int lastPosition = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= distance) {
                cowsPlaced++;
                lastPosition = stalls[i];
                
                if (cowsPlaced == k) {
                    return true; 
                }
            }
        }
        return false;
    }//
}