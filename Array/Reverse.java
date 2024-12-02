// ? Reverse an array
//  !  Day-3

class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int  temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
            // arr[i]=arr[i]+arr[n-1-i];
            // arr[n-1-i]=arr[i]-arr[n-i-1];
            // arr[i]=arr[i]-arr[n-i-1];
            
           
        }
    }
}