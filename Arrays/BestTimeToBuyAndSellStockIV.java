/*
Problem: Best Time to Buy and Sell Stock IV

Pattern: Dynamic Programming / State Machine

Observation:
At most k transactions allowed.

Maintain:
- buy[i]
- sell[i]

buy[i]  -> best state after ith buy
sell[i] -> best state after ith sell

Optimization:
If k >= n/2,
it becomes unlimited transactions problem.

Time Complexity: O(n*k)
Space Complexity: O(k)
*/

class Solution {

    public int maxProfit(int k, int[] prices) {

        if(prices.length == 0 || k == 0) {

            return 0;
        }

        // Unlimited transactions optimization
        if(k >= prices.length / 2) {

            int profit = 0;

            for(int i = 1; i < prices.length; i++) {

                if(prices[i] > prices[i - 1]) {

                    profit += prices[i] - prices[i - 1];
                }
            }

            return profit;
        }

        int[] buy = new int[k];

        int[] sell = new int[k];

        Arrays.fill(buy, Integer.MIN_VALUE);

        for(int price : prices) {

            buy[0] = Math.max(buy[0], -price);

            sell[0] = Math.max(sell[0], buy[0] + price);

            for(int i = 1; i < k; i++) {

                buy[i] = Math.max(buy[i], sell[i - 1] - price);

                sell[i] = Math.max(sell[i], buy[i] + price);
            }
        }

        return sell[k - 1];
    }
}
