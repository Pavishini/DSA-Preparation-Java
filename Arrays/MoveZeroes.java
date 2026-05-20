/*
Problem: Move Zeroes

Pattern: Two Pointer Compaction

Observation:
Non-zero elements should maintain order.

Approach:
- Move non-zero elements forward
- Fill remaining positions with zeroes

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public void moveZeroes(int[] nums) {

        int ele = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != 0) {

                nums[ele] = nums[i];

                ele++;
            }
        }

        while(ele < nums.length) {

            nums[ele] = 0;

            ele++;
        }
    }
}
