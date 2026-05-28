/*
Problem: Best Time to Buy and Sell Stock III

Pattern: Dynamic Programming / State Machine

Observation:
At most two transactions allowed.

Track:
- first buy
- first sell
- second buy
- second sell

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxProfit(int[] prices) {

        if(prices.length == 0) {

            return 0;
        }

        int fb = Integer.MIN_VALUE;

        int fs = 0;

        int sb = Integer.MIN_VALUE;

        int ss = 0;

        for(int price : prices) {

            fb = Math.max(fb, -price);

            fs = Math.max(fs, fb + price);

            sb = Math.max(sb, fs - price);

            ss = Math.max(ss, sb + price);
        }

        return ss;
    }
}
