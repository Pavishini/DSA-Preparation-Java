/*
Problem: Longest Consecutive Sequence

Pattern: HashSet + Sequence Expansion

Observation:
A number starts a sequence only if (num - 1) is absent.

Approach:
- Store all elements in HashSet
- Start sequence only when previous number is absent
- Expand sequence using current + 1

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int longest = 0;

        // Add all elements to HashSet
        for(int i = 0; i < nums.length; i++) {

            set.add(nums[i]);
        }

        // Find longest sequence
        for(int i = 0; i < nums.length; i++) {

            // Start of sequence
            if(!set.contains(nums[i] - 1)) {

                int current = nums[i];

                int count = 1;

                // Expand sequence
                while(set.contains(current + 1)) {

                    current++;

                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
