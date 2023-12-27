/* 
Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as sqrt.

 

Example 1:

Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
Example 2:

Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
 

Constraints:

1 <= num <= 231 - 1
*/

class Solution {

    public boolean isPerfectSquare(int num) {

        if (num == 1) {

            return true;
        }

        int start = 0;

        int end = num;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if ((long) mid * mid > num) {

                end = mid - 1;

            } else if ((long) mid * mid < num) {

                start = mid + 1;

            } else {

                return true;
            }

        }

        return false;
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
 * 40.35
 * MB
 * Beats
 * 6.33%
 * of users with Java
 */
