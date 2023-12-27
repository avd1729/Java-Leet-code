/* 
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

 

Example 1:


Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.
Example 2:


Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.
 

Constraints:

1 <= n <= 231 - 1
*/

class Solution {

    public int arrangeCoins(int n) {

        int start = 0;

        int end = n;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            long target = ((long) mid * (mid + 1)) / 2;

            if (target == n)
                return mid;

            else if (target > n)
                end = mid - 1;

            else
                start = mid + 1;

        }

        return end;
    }
}

/*
 * Runtime
 * 1
 * ms
 * Beats
 * 99.77%
 * of users with Java
 * Memory
 * 40.96
 * MB
 * Beats
 * 6.16%
 * of users with Java
 */
