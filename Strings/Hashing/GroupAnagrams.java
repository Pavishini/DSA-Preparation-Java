/*
Problem: Group Anagrams (LC 49)

Pattern: Hashing / Signature Grouping

Observation:
All anagrams produce the same string after sorting.

Approach:
- Sort each word to create a signature key
- Use HashMap<String, List<String>>
- Group words with the same signature
- Return all grouped values

Time Complexity: O(n * k log k)
n = number of strings
k = average string length

Space Complexity: O(n * k)

Key Insight:
Anagrams share the same sorted representation.
*/

class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {

            String word = strs[i];

            char[] arr = word.toCharArray();
            Arrays.sort(arr);

            String key = new String(arr);

            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
