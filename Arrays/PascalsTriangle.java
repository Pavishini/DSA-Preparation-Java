/*
Problem: Pascal's Triangle

Pattern: Mathematical Combination (nCr)

Observation:
Each element can be generated using the previous element.

Approach:
- Start every row with 1
- Generate next element using:
  res = (res * (row - col)) / col

Time Complexity: O(n²)
Space Complexity: O(1) excluding output
*/

class Solution {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int row = 1; row <= numRows; row++) {

            List<Integer> ansRow = new ArrayList<>();

            long res = 1;

            ansRow.add(1);

            for(int col = 1; col < row; col++) {

                res = (res * (row - col)) / col;

                ansRow.add((int)res);
            }

            ans.add(ansRow);
        }

        return ans;
    }
}
