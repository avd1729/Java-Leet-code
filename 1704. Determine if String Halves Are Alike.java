/* 
You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

 

Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2:

Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
 

Constraints:

2 <= s.length <= 1000
s.length is even.
s consists of uppercase and lowercase letters.
*/

class Solution {
    public boolean halvesAreAlike(String s) {

        s = s.toLowerCase();

        char[] arr = { 'a', 'e', 'i', 'o', 'u' };
        int mid = s.length() / 2;

        String firstHalf = s.substring(0, mid);
        String secondHalf = s.substring(mid);

        int first = 0;
        int second = 0;

        for (int i = 0; i < firstHalf.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (firstHalf.charAt(i) == arr[j]) {
                    first++;
                }
            }
        }
        for (int i = 0; i < secondHalf.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (secondHalf.charAt(i) == arr[j]) {
                    second++;
                }
            }
        }
        return (first == second);
    }
}

/*
 * Runtime
 * 6
 * ms
 * Beats
 * 33.66%
 * of users with Java
 * Memory
 * 42.02
 * MB
 * Beats
 * 16.90%
 * of users with Java
 */
