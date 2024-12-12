class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n=arr.length,count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count+=1;
            }
        }
        return count;


        //  ! usingn streams
        // return (int) Arrays.stream(arr)
        //                   .filter(num -> num == target)
        //                   .count();
    }
}