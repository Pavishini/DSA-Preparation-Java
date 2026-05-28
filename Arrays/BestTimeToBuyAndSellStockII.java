/*
Problem: Best Time to Buy and Sell Stock II

Pattern: Greedy

Observation:
Capture every upward movement.

If:
today > yesterday

Add profit.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxProfit(int[] prices) {

        int profit = 0;

        for(int i = 1; i < prices.length; i++) {

            if(prices[i] > prices[i - 1]) {

                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}
