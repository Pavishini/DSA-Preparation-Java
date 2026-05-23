/*
Problem: Find Missing and Repeating Element

Pattern: Frequency Array

Observation:
- One number appears twice
- One number is missing

Approach:
- Store frequencies using freq[]
- freq[i] == 2 → repeating
- freq[i] == 0 → missing

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {

    ArrayList<Integer> findTwoElement(int arr[]) {

        int n = arr.length;

        int[] freq = new int[n + 1];

        // Count frequencies
        for(int i = 0; i < n; i++) {

            freq[arr[i]]++;
        }

        int repeating = -1;

        int missing = -1;

        // Find repeating and missing
        for(int i = 1; i <= n; i++) {

            if(freq[i] == 2) {

                repeating = i;
            }

            else if(freq[i] == 0) {

                missing = i;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(repeating);

        ans.add(missing);

        return ans;
    }
}
