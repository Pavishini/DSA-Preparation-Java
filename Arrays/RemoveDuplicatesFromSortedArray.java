/*
Problem: Remove Duplicates from Sorted Array

Pattern: Two Pointers

Observation:
Array is sorted, so duplicates are adjacent.

Approach:
Use one pointer to track unique elements
and overwrite duplicates.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int removeDuplicates(int[] nums) {

        int ele = 0;

        for(int i = 1; i < nums.length; i++) {

            if(nums[ele] != nums[i]) {

                ele++;

                nums[ele] = nums[i];
            }
        }

        return ele + 1;
    }
}
