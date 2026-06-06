/*
Problem: Find All Anagrams in a String (LC 438)

Pattern: Sliding Window + Frequency Count

Observation:
Two strings are anagrams if their character frequencies are identical.

Approach:
- Store frequency of pattern string
- Build frequency of first window in the source string
- Compare both frequency arrays
- Slide the window:
    - Remove left character
    - Add right character
- If frequencies match, store the window's starting index

Time Complexity: O(n)
Space Complexity: O(1)

Key Insight:
Instead of rebuilding frequencies for every substring,
update the frequency array as the window slides.
*/

class Solution {

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        int winSize = p.length();

        if(winSize > s.length()) {
            return ans;
        }

        int[] pfreq = new int[26];
        int[] sfreq = new int[26];

        // Build pattern frequency
        for(char c : p.toCharArray()) {
            pfreq[c - 'a']++;
        }

        // Build first window frequency
        for(int i = 0; i < winSize; i++) {
            sfreq[s.charAt(i) - 'a']++;
        }

        // Check first window
        if(Arrays.equals(pfreq, sfreq)) {
            ans.add(0);
        }

        // Slide the window
        for(int i = winSize; i < s.length(); i++) {

            // Remove left character
            sfreq[s.charAt(i - winSize) - 'a']--;

            // Add right character
            sfreq[s.charAt(i) - 'a']++;

            // Check if current window is an anagram
            if(Arrays.equals(pfreq, sfreq)) {
                ans.add(i - winSize + 1);
            }
        }

        return ans;
    }
}
