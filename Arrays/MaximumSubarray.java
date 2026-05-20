/*
Problem: Maximum Subarray

Pattern: Kadane's Algorithm

Observation:
Negative running sum reduces future subarray sum.

Approach:
- Add current element to running sum
- Update maximum sum
- Reset running sum if it becomes negative

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {

            currentSum += nums[i];

            if(currentSum > maxSum) {

                maxSum = currentSum;
            }

            if(currentSum < 0) {

                currentSum = 0;
            }
        }

        return maxSum;
    }
}
