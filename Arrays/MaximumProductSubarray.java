/*
Problem: Maximum Product Subarray

Pattern: Dynamic Programming / Kadane Variant

Observation:
Negative × Negative = Positive

Approach:
Maintain:
- current maximum product
- current minimum product

At every index:
Check:
1. nums[i]
2. currMax * nums[i]
3. currMin * nums[i]

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxProduct(int[] nums) {

        int currMax = nums[0];

        int currMin = nums[0];

        int ans = nums[0];

        for(int i = 1; i < nums.length; i++) {

            int tempMax = Math.max(nums[i],
                          Math.max(currMax * nums[i],
                                   currMin * nums[i]));

            int tempMin = Math.min(nums[i],
                          Math.min(currMax * nums[i],
                                   currMin * nums[i]));

            currMax = tempMax;

            currMin = tempMin;

            ans = Math.max(ans, currMax);
        }

        return ans;
    }
}
