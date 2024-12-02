//? Secong largest element in a array
// ! Day-1
// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        
        int largest=Integer.MIN_VALUE;
        int sLargest=Integer.MIN_VALUE;
        
        for(int num:arr){
            if(num>largest){
                sLargest=largest;
                largest=num;
            }
            else if(num > sLargest && num!=largest ){
                sLargest=num;
            }
        }
        
        
        return (sLargest==Integer.MIN_VALUE)?-1:sLargest;
    }
}