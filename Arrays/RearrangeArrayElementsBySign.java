/*
Problem: Rearrange Array Elements by Sign

Pattern: Index Placement

Observation:
Positive numbers go to even indexes.
Negative numbers go to odd indexes.

Approach:
- Use separate indexes for positive and negative numbers
- Place them alternatively in result array

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public int[] rearrangeArray(int[] nums) {

        int pos = 0;
        int neg = 1;

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] > 0) {

                ans[pos] = nums[i];

                pos += 2;
            }

            else {

                ans[neg] = nums[i];

                neg += 2;
            }
        }

        return ans;
    }
}
