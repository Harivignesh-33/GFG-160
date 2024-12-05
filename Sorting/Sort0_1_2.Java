class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        
        int low,mid,high;
        low=0;
        mid=0;
        high=arr.length-1;
        
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low+=1;
                mid+=1;
            }
            else if(arr[mid]==1){
                mid+=1;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high-=1;
            }
            
        }
    }
}