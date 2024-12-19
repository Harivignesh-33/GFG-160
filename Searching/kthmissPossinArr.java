class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int n=arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i]>(k+i)){
                return k+i;
            }
        }
        return k+n;
    }
}