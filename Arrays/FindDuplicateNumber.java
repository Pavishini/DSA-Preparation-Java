/*
Problem: Find the Duplicate Number

Pattern: Frequency Counting

Observation:
One number appears more than once.

Approach:
- Count frequencies
- First freq > 1 is duplicate

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public int findDuplicate(int[] nums) {

        int[] freq = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++) {

            freq[nums[i]]++;
        }

        for(int i = 1; i <= nums.length; i++) {

            if(freq[i] > 1) {

                return i;
            }
        }

        return -1;
    }
}
