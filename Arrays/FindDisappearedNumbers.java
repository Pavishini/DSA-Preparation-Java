/*
Problem: Find All Numbers Disappeared in an Array

Pattern: Presence Checking

Observation:
Numbers range from 1 to n.

Approach:
- Count frequencies
- Missing numbers have freq = 0

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        int[] freq = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++) {

            freq[nums[i]]++;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 1; i <= nums.length; i++) {

            if(freq[i] == 0) {

                ans.add(i);
            }
        }

        return ans;
    }
}
