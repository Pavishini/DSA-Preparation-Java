/*
Problem: Search in Rotated Sorted Array

Pattern: Binary Search

Observation:
In a rotated sorted array,
one half is always sorted.

Approach:
- Find the sorted half
- Check if target lies in that half
- Discard the other half

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {

    public int search(int[] nums, int target) {

        int left = 0;

        int right = nums.length - 1;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {

                return mid;
            }

            // Left half is sorted
            if(nums[left] <= nums[mid]) {

                if(target >= nums[left] &&
                   target < nums[mid]) {

                    right = mid - 1;
                }

                else {

                    left = mid + 1;
                }
            }

            // Right half is sorted
            else {

                if(target > nums[mid] &&
                   target <= nums[right]) {

                    left = mid + 1;
                }

                else {

                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}
