/*
Problem: Missing Number

Pattern: Mathematical Summation

Observation:
Array contains numbers from 0 to n with one missing.

Approach:
- Find expected sum from 0 to n
- Subtract actual array sum

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int missingNumber(int[] nums) {

        int n = nums.length;

        int total = (n * (n + 1)) / 2;

        int sum = 0;

        for(int i = 0; i < nums.length; i++) {

            sum += nums[i];
        }

        return total - sum;
    }
}
