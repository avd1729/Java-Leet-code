/* 
You are given an integer n and an integer start.

Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.

Return the bitwise XOR of all elements of nums.

 

Example 1:

Input: n = 5, start = 0
Output: 8
Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
Where "^" corresponds to bitwise XOR operator.
Example 2:

Input: n = 4, start = 3
Output: 8
Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.
 

Constraints:

1 <= n <= 1000
0 <= start <= 1000
n == nums.length
*/

class Solution {
    public int xorOperation(int n, int start) {

        int ans = start;
        int temp = 1;

        while (temp <= n) {

            if (temp == n) {
                return ans;
            } else {
                ans ^= start + 2;
                start += 2;
                temp++;
            }
        }
        return ans;
    }
}

/*
 * Runtime
 * 0
 * ms
 * Beats
 * 100.00%
 * of users with Java
 * Memory
 * 40.45
 * MB
 * Beats
 * 19.44%
 * of users with Java
 */
