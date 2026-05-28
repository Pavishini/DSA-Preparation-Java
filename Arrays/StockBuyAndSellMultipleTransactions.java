/*
Problem: Stock Buy and Sell – Multiple Transactions Allowed

Pattern: Greedy

Observation:
Whenever current price is greater than previous price,
take the profit.

Approach:
- Capture every upward slope
- Add all positive differences

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
