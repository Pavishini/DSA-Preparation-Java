/*
Problem: Third Maximum Number

Pattern: Multiple Maximum Tracking

Observation:
Track top 3 distinct maximum elements.

Approach:
- Maintain first, second, and third maximums
- Ignore duplicates
- Shift values when larger element appears

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {

    public int thirdMax(int[] nums) {

        long fnum = Long.MIN_VALUE;
        long snum = Long.MIN_VALUE;
        long tnum = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if(num == fnum || num == snum || num == tnum) {

                continue;
            }

            if(num > fnum) {

                tnum = snum;
                snum = fnum;
                fnum = num;
            }

            else if(num > snum) {

                tnum = snum;
                snum = num;
            }

            else if(num > tnum) {

                tnum = num;
            }
        }

        if(tnum == Long.MIN_VALUE) {

            return (int) fnum;
        }

        return (int) tnum;
    }
}
