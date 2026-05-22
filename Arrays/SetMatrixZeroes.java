/*
Problem: Set Matrix Zeroes

Pattern: Row and Column Marking

Observation:
If an element is 0,
its entire row and column must become 0.

Approach:
- Use row[] and col[] arrays
- Mark rows and columns containing zero
- Traverse again and set elements to zero

Time Complexity: O(rows × cols)
Space Complexity: O(rows + cols)
*/

class Solution {

    public void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] row = new int[rows];
        int[] col = new int[cols];

        // Step 1: Mark rows and columns
        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                if(matrix[i][j] == 0) {

                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Step 2: Set zeroes
        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                if(row[i] == 1 || col[j] == 1) {

                    matrix[i][j] = 0;
                }
            }
        }
    }
}
