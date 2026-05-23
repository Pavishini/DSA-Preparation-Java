/*
Problem: Longest Consecutive Sequence

Pattern: HashSet + Sequence Expansion

Observation:
A number starts a sequence only if (num - 1) is absent.

Approach:
- Store all elements in HashSet
- Start sequence only when previous number is absent
- Expand sequence using current + 1
- Iterate over HashSet to avoid duplicate checks

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Add all elements to HashSet
        for(int num : nums) {

            set.add(num);
        }

        int longest = 0;

        // Traverse HashSet
        for(int num : set) {

            // Start of sequence
            if(!set.contains(num - 1)) {

                int current = num;

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
