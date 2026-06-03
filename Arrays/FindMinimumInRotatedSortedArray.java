/*
Problem: Find Minimum in Rotated Sorted Array

Pattern: Binary Search

Observation:
The minimum element lies in the unsorted half.

Approach:
- Compare middle element with right element.
- If nums[mid] > nums[right],
  minimum is in the right half.
- Otherwise,
  minimum is in the left half (including mid).

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {

    public int findMin(int[] nums) {

        int left = 0;

        int right = nums.length - 1;

        while(left < right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] > nums[right]) {

                left = mid + 1;
            }

            else {

                right = mid;
            }
        }

        return nums[left];
    }
}
