/*
Problem: Best Time to Buy and Sell Stock with Cooldown

Pattern: Dynamic Programming / State Machine

States:
- buy  -> currently holding stock
- sell -> sold stock today
- rest -> cooldown / doing nothing

Observation:
After selling stock,
cannot buy on the next day.

Transitions:
buy  = max(previous buy, previous rest - price)
sell = previous buy + price
rest = max(previous rest, previous sell)

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxProfit(int[] prices) {

        if(prices.length == 0) {

            return 0;
        }

        int buy = -prices[0];

        int sell = 0;

        int rest = 0;

        for(int i = 1; i < prices.length; i++) {

            int prevBuy = buy;

            int prevSell = sell;

            int prevRest = rest;

            buy = Math.max(prevBuy, prevRest - prices[i]);

            sell = prevBuy + prices[i];

            rest = Math.max(prevRest, prevSell);
        }

        return Math.max(sell, rest);
    }
}
