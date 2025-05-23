/* 
You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
Return the string formed after mapping.

The test cases are generated so that a unique mapping will always exist.

 

Example 1:

Input: s = "10#11#12"
Output: "jkab"
Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
Example 2:

Input: s = "1326#"
Output: "acz"
 

Constraints:

1 <= s.length <= 1000
s consists of digits and the '#' letter.
s will be a valid string such that mapping is always possible.
*/

class Solution {
    public String freqAlphabets(String s) {

        for (int i = 10; i <= 26; i++) {
            s = s.replaceAll(i + "#", (char) ('a' + (i - 1)) + "");
        }

        for (int i = 1; i <= 9; i++) {
            s = s.replaceAll(i + "", (char) ('a' + (i - 1)) + "");
        }

        return s;
    }
}

/*
 * Runtime
 * 11
 * ms
 * Beats
 * 8.09%
 * of users with Java
 * Memory
 * 43.24
 * MB
 * Beats
 * 5.25%
 * of users with Java
 */