/*
Problem: Find Element in Pascal's Triangle

Pattern: Mathematics / nCr Combination

Observation:
Element at row R and column C is:
nCr = (R-1)C(C-1)

Time Complexity: O(C)
Space Complexity: O(1)
*/

class Solution {

    static long findElement(int row, int col) {

        int n = row - 1;

        int r = col - 1;

        long res = 1;

        for(int i = 1; i <= r; i++) {

            res = (res * (n - r + i)) / i;
        }

        return res;
    }
}
