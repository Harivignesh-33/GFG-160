class Solution {

    public int peakElement(int[] arr) {
        // code here
        for (int i = 0; i < arr.length; i++){
             if ((i == 0 || arr[i] > arr[i - 1]) && (i == arr.length - 1 || arr[i] > arr[i + 1])) 
             {
                 return i;
             }
        }
        return -1;
    }
}