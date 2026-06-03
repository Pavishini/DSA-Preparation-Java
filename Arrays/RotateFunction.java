/*
Problem: Rotate Function

Pattern: Rotation Mathematics

Observation:
Instead of recomputing every rotation,
use the relation:

F(k) = F(k-1) + totalSum - n * rotatedElement

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int maxRotateFunction(int[] nums) {

        int n = nums.length;

        int totalSum = 0;

        int currentRotationValue = 0;

        for(int i = 0; i < n; i++) {

            totalSum += nums[i];

            currentRotationValue += i * nums[i];
        }

        int maximumValue = currentRotationValue;

        for(int i = n - 1; i > 0; i--) {

            currentRotationValue = currentRotationValue + totalSum - n * nums[i];

            maximumValue = Math.max(maximumValue,currentRotationValue);
        }

        return maximumValue;
    }
}
