/*
Problem: Contains Duplicate

Pattern: Hashing

Observation:
Need fast duplicate detection.

Approach:
- Store elements in HashSet
- If element already exists, duplicate found

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashSet;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {

            if(set.contains(nums[i])) {

                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }
}
