// ? stock buy and sell multiple transaction allowed
// !  Day-7

class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int n = prices.length;
        int maxProfit = 0;

        // Iterate through the array and add profit for every upward trend
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }
}