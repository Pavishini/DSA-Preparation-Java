/*
Problem: Single Number

Pattern: Bit Manipulation (XOR)

Observation:
Duplicate numbers cancel each other using XOR.

Approach:
- XOR all elements
- Equal numbers become 0
- Remaining value is the single number

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int singleNumber(int[] nums) {

        int single = 0;

        for(int i = 0; i < nums.length; i++) {

            single = single ^ nums[i];
        }

        return single;
    }
}
