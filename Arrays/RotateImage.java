/*
Problem: Rotate Image

Pattern: Matrix Transformation

Approach:
1. Transpose the matrix
2. Reverse every row

Observation:
Transpose converts rows into columns.
Reversing rows gives 90 degree clockwise rotation.

Time Complexity: O(n²)
Space Complexity: O(1)
*/

class Solution {

    public void rotate(int[][] matrix) {

        int n = matrix.length;

        // Step 1: Transpose
        for(int i = 0; i < n; i++) {

            for(int j = i; j < n; j++) {

                int temp = matrix[i][j];

                matrix[i][j] = matrix[j][i];

                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse every row
        for(int i = 0; i < n; i++) {

            int left = 0;

            int right = n - 1;

            while(left < right) {

                int temp = matrix[i][left];

                matrix[i][left] = matrix[i][right];

                matrix[i][right] = temp;

                left++;

                right--;
            }
        }
    }
}
