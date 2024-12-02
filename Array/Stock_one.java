// ? stock buy and sell multiple transaction allowed
// !  Day-8
class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int buy = Integer.MAX_VALUE; // buy val
        int maxProfit = 0;           

        for (int price : prices) {
        
            if (price < buy) {
                buy = price;
            } else {
        
                maxProfit = Math.max(maxProfit, price - buy);
            }
        }

        return maxProfit;
    }
}