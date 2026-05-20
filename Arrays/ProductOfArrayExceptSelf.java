/*
Problem: Product of Array Except Self

Pattern: Prefix and Suffix Product

Observation:
Each index needs product of elements
before and after it.

Approach:
- Store left product in answer array
- Traverse from right and multiply suffix product

Time Complexity: O(n)
Space Complexity: O(1) extra space
*/

class Solution {

    public int[] productExceptSelf(int[] nums) {

        int left = 1;
        int right = 1;

        int[] arr = new int[nums.length];

        // Prefix products
        for(int i = 0; i < nums.length; i++) {

            arr[i] = left;

            left = left * nums[i];
        }

        // Suffix products
        for(int i = nums.length - 1; i >= 0; i--) {

            arr[i] = arr[i] * right;

            right = right * nums[i];
        }

        return arr;
    }
}
