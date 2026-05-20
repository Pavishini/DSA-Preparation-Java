/*
Problem: Majority Element

Pattern: Boyer Moore Voting Algorithm

Observation:
Majority element appears more than n/2 times.

Approach:
- Maintain candidate element
- Increase count for same element
- Decrease count for different element

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int majorityElement(int[] nums) {

        int count = 0;
        int ele = 0;

        for(int i = 0; i < nums.length; i++) {

            if(count == 0) {

                ele = nums[i];
            }

            if(ele == nums[i]) {

                count++;
            }

            else {

                count--;
            }
        }

        return ele;
    }
}
