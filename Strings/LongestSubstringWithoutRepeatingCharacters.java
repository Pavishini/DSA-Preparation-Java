/*
Problem: Longest Substring Without Repeating Characters (LC 3)

Pattern: Variable Size Sliding Window + HashSet

Observation:
A valid window contains only unique characters.

Approach:
- Expand the window using the right pointer
- If a duplicate character appears:
    - Shrink the window from the left
    - Remove characters until the duplicate disappears
- Update maximum window length

Time Complexity: O(n)
Space Complexity: O(min(n, charset))

Key Insight:
Unlike fixed-size sliding windows,
the window size changes dynamically.
Shrink only when the window becomes invalid.
*/

class Solution {

    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++) {

            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
