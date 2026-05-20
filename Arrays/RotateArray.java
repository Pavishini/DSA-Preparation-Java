/*
Problem: Rotate Array

Pattern: Array Reversal

Observation:
Reversing parts of the array helps rotate efficiently.

Approach:
1. Reverse entire array
2. Reverse first k elements
3. Reverse remaining elements

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public void reverse(int[] nums, int low, int high) {

        while(low < high) {

            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;

            low++;
            high--;
        }
    }

    public void rotate(int[] nums, int k) {

        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);

        reverse(nums, 0, k - 1);

        reverse(nums, k, nums.length - 1);
    }
}
