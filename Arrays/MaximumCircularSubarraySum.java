/*
Problem: Maximum Circular Subarray Sum

Pattern: Kadane's Algorithm

Observation:
Maximum circular sum can be:

1. Normal maximum subarray sum
2. Total Sum - Minimum subarray sum

Edge Case:
If all elements are negative,
return the normal maximum subarray sum.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxSubarraySumCircular(int[] nums) {

        int globalMax = nums[0];
        int globalMin = nums[0];

        int currentMax = 0;
        int currentMin = 0;

        int totalSum = 0;

        for(int num : nums) {

            currentMax = Math.max(num, currentMax + num);

            currentMin = Math.min(num, currentMin + num);

            totalSum += num;

            globalMax = Math.max(globalMax, currentMax);

            globalMin = Math.min(globalMin, currentMin);
        }

        if(globalMax < 0) {

            return globalMax;
        }

        return Math.max(globalMax, totalSum - globalMin);
    }
}
