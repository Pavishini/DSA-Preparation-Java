/*
Problem: First Unique Character in a String (LC 387)

Pattern: Hashing / Frequency Count

Observation:
A unique character appears exactly once.
We need to return the index of the first such character.

Approach:
- Count frequency of each character
- Traverse the string again
- Return the first index whose frequency is 1
- If none exists, return -1

Time Complexity: O(n)
Space Complexity: O(1)

Key Insight:
Count first, then scan again to preserve the original order.
*/

class Solution {

    public int firstUniqChar(String s) {

        int[] freq = new int[26];

        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for(int i = 0; i < s.length(); i++) {

            if(freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
