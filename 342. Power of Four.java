/* 
Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.

 

Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false
Example 3:

Input: n = 1
Output: true
 

Constraints:

-231 <= n <= 231 - 1
*/

class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1)
            return true;
        if (n == 0 || n % 4 != 0)
            return false;
        return isPowerOfFour(n / 4);
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
 * 40.99
 * MB
 * Beats
 * 17.02%
 * of users with Java
 */
