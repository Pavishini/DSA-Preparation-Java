/*
Problem: Set Mismatch

Pattern: Frequency Counting

Observation:
- One number repeats
- One number is missing

Approach:
- Store frequencies
- freq[i] == 2 → repeated
- freq[i] == 0 → missing

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public int[] findErrorNums(int[] nums) {

        int[] freq = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++) {

            freq[nums[i]]++;
        }

        int repeated = 0;

        int missing = 0;

        for(int i = 1; i <= nums.length; i++) {

            if(freq[i] == 2) {

                repeated = i;
            }

            else if(freq[i] == 0) {

                missing = i;
            }
        }

        return new int[]{repeated, missing};
    }
}
