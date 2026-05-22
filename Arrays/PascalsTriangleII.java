/*
Problem: Pascal's Triangle II

Pattern: Mathematical Combination (nCr)

Observation:
Each element can be generated using the previous element.

Approach:
- Start with 1
- Generate next element using:
  res = (res * (rowIndex - col + 1)) / col

Time Complexity: O(n)
Space Complexity: O(1) excluding output
*/

class Solution {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> ansRow = new ArrayList<>(rowIndex + 1);

        long res = 1;

        ansRow.add(1);

        for(int col = 1; col <= rowIndex; col++) {

            res = (res * (rowIndex - col + 1)) / col;

            ansRow.add((int)res);
        }

        return ansRow;
    }
}
