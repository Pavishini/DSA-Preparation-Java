/*
Problem: First Missing Positive

Pattern: Presence Checking with Filtering

Observation:
Ignore:
- negative numbers
- zero
- numbers greater than n

Approach:
- Store valid positive numbers in frequency array
- First missing frequency gives answer

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public int firstMissingPositive(int[] nums) {

        int[] freq = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] > 0 && nums[i] <= nums.length) {

                freq[nums[i]]++;
            }
        }

        for(int i = 1; i <= nums.length; i++) {

            if(freq[i] == 0) {

                return i;
            }
        }

        return nums.length + 1;
    }
}
