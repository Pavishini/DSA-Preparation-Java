/*
Problem: Word Pattern (LC 290)

Pattern: Hashing / Character Mapping

Observation:
Each pattern character must map to exactly one word
and each word must map to exactly one pattern character.

Approach:
- Split the string into words
- Check if pattern length matches word count
- Use two HashMaps:
    pattern -> word
    word -> pattern
- Verify mapping consistency at each position

Time Complexity: O(n)
Space Complexity: O(n)

Key Insight:
This is the same pattern as Isomorphic Strings,
except we map characters to words instead of characters.
*/

class Solution {

    public boolean wordPattern(String pattern, String s) {

        HashMap<Character,String> mapPS = new HashMap<>();
        HashMap<String,Character> mapSP = new HashMap<>();

        String[] sen = s.split(" ");

        if(pattern.length() != sen.length){
            return false;
        }

        for(int i = 0; i < pattern.length(); i++) {

            char c = pattern.charAt(i);
            String w = sen[i];

            if(mapPS.containsKey(c)) {

                if(!mapPS.get(c).equals(w)) {
                    return false;
                }
            }

            else if(mapSP.containsKey(w)) {

                if(!mapSP.get(w).equals(c)) {
                    return false;
                }
            }

            if(!mapPS.containsKey(c) && !mapSP.containsKey(w)) {

                mapPS.put(c, w);
                mapSP.put(w, c);
            }
        }

        return true;
    }
}
