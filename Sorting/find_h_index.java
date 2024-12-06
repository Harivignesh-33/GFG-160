class Solution {
    // Function to find hIndex
    public int hIndex(int[] citations) {
        // code here
        Arrays.sort(citations);
        
        int n=citations.length;
        for(int i=0;i<n;i++){
            int index=n-i;
            if(citations[i]>=index){
                return index;
            }
        }
        return 0;
    }
}