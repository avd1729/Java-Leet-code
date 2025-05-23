/* 
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 

Constraints:

-100.0 < x < 100.0
-231 <= n <= 231-1
n is an integer.
Either x is not zero or n > 0.
-104 <= xn <= 104
*/

class Solution {
    public double myPow(double x, int n) {
        double result = 0;
        if (n == 1) {
            return x;
        } else if (n == 0) {
            return 1;
        } else if (n < 0) {
            int y = -n;
            result = x * myPow(x, y - 1);
            return 1 / result;
        } else {
            result = myPow(x, n / 2);
            if (n % 2 == 0) {
                return result * result;
            } else {
                return x * result * result;
            }
        }
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
 * 42.88
 * MB
 * Beats
 * 9.45%
 * of users with Java
 */
