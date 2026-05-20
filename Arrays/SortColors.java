/*
Problem: Sort Colors

Pattern: Dutch National Flag Algorithm

Observation:
Array contains only 0s, 1s, and 2s.

Approach:
- left tracks position for 0
- mid traverses array
- right tracks position for 2

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public void sortColors(int[] nums) {

        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        while(mid <= right) {

            if(nums[mid] == 0) {

                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;

                left++;
                mid++;
            }

            else if(nums[mid] == 1) {

                mid++;
            }

            else {

                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;

                right--;
            }
        }
    }
}
