/*
Problem: Valid Anagram (LC 242)

Pattern: Hashing / Frequency Count

Observation:
Two strings are anagrams if every character appears
the same number of times in both strings.

Approach:
- If lengths differ, return false
- Create a frequency array of size 26
- Increment counts using first string
- Decrement counts using second string
- If all frequencies become zero, strings are anagrams

Time Complexity: O(n)
Space Complexity: O(1)

Key Insight:
For lowercase English letters, int[26] is more efficient
than HashMap<Character, Integer>.
*/

class Solution {

    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for(char c : t.toCharArray()) {
            freq[c - 'a']--;
        }

        for(int count : freq) {
            if(count != 0) {
                return false;
            }
        }

        return true;
    }
}
