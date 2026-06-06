/*
Problem: Permutation in String (LC 567)

Pattern: Sliding Window + Frequency Count

Observation:
A permutation of s1 exists in s2 if any window
of length s1.length() has the same character frequencies.

Approach:
- Build frequency array for s1
- Build frequency array for first window in s2
- Compare frequencies
- Slide the window:
    remove left character
    add right character
- Return true on first match

Time Complexity: O(n)

Space Complexity: O(1)

Key Insight:
This is the same pattern as
Find All Anagrams in a String,
but we return true/false instead of indices.
*/

class Solution {

    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) {
            return false;
        }

        int winSize = s1.length();

        int[] s1freq = new int[26];
        int[] s2freq = new int[26];

        for(char c : s1.toCharArray()) {
            s1freq[c - 'a']++;
        }

        for(int i = 0; i < winSize; i++) {
            s2freq[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(s1freq, s2freq)) {
            return true;
        }

        for(int i = winSize; i < s2.length(); i++) {

            s2freq[s2.charAt(i - winSize) - 'a']--;

            s2freq[s2.charAt(i) - 'a']++;

            if(Arrays.equals(s1freq, s2freq)) {
                return true;
            }
        }

        return false;
    }
}
