/*
Problem: Isomorphic Strings (LC 205)

Pattern: Hashing / Character Mapping

Observation:
Each character in the first string must map to exactly
one character in the second string and vice versa.

Approach:
- Use two HashMaps
- mapST stores s -> t mappings
- mapTS stores t -> s mappings
- Verify consistency at every index
- If a mismatch occurs, return false

Time Complexity: O(n)
Space Complexity: O(1)

Key Insight:
Frequency counting is not enough.
We need a one-to-one mapping between characters.
*/

class Solution {

    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(mapST.containsKey(c1)){
                if(mapST.get(c1) != c2){
                    return false;
                }
            }

            if(mapTS.containsKey(c2)){
                if(mapTS.get(c2) != c1){
                    return false;
                }
            }

            if(!mapST.containsKey(c1) && !mapTS.containsKey(c2)){
                mapST.put(c1, c2);
                mapTS.put(c2, c1);
            }
        }

        return true;
    }
}
