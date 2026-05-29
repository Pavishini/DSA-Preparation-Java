/*
Problem: Best Time to Buy and Sell Stock with Transaction Fee

Pattern: Dynamic Programming / State Machine

States:
- buy  -> holding stock
- sell -> not holding stock

Observation:
Whenever stock is sold,
transaction fee is deducted.

Transitions:
buy  = max(previous buy, previous sell - price)
sell = max(previous sell,
           previous buy + price - fee)

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxProfit(int[] prices, int fee) {

        if(prices.length == 0) {

            return 0;
        }

        int buy = -prices[0];

        int sell = 0;

        for(int i = 1; i < prices.length; i++) {

            int prevBuy = buy;

            int prevSell = sell;

            buy = Math.max(prevBuy, prevSell - prices[i]);

            sell = Math.max(prevSell, prevBuy + prices[i] - fee);
        }

        return sell;
    }
}
