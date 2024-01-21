/* 
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"
 

Constraints:

1 <= columnNumber <= 231 - 1
*/

class Solution {
    public String convertToTitle(int c) {
        if (c < 27) {
            return Character.toString((char) ('A' + (c - 1)));
        }
        StringBuilder ans = new StringBuilder("");
        while (c > 0) {
            int x = c % 26;
            if (x == 0) {
                ans.append('Z');
                c--;
            } else {
                ans.append((char) ('A' + x - 1));
            }
            c /= 26;
        }
        return ans.reverse().toString();
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
 * 41.17
 * MB
 * Beats
 * 13.52%
 * of users with Java
 */