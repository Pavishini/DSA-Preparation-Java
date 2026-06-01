/*
Problem: Maximum Absolute Sum of Any Subarray

Pattern: Kadane's Algorithm

Observation:
Maximum absolute sum can come from:

1. Maximum subarray sum
2. Minimum subarray sum

Answer:
max(|maximum subarray sum|,
    |minimum subarray sum|)

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxAbsoluteSum(int[] nums) {

        int globalMax = nums[0];
        int globalMin = nums[0];

        int currentMax = 0;
        int currentMin = 0;

        for(int num : nums) {

            currentMax = Math.max(num,
                                  currentMax + num);

            currentMin = Math.min(num,
                                  currentMin + num);

            globalMax = Math.max(globalMax,
                                 currentMax);

            globalMin = Math.min(globalMin,
                                 currentMin);
        }

        return Math.max(Math.abs(globalMax),
                        Math.abs(globalMin));
    }
}
