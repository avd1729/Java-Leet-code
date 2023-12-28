/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.

 

Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 

Constraints:

1 <= arr.length <= 1000
1 <= arr[i] <= 1000
1 <= k <= 1000
arr[i] < arr[j] for 1 <= i < j <= arr.length
 */

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int prev = 0, i = 0;
        while (i < n) {
            if (arr[i] == prev + 1) {
                i++;
            }

            else {
                k--;
                if (k == 0)
                    return prev + 1;

            }
            prev++;
        }

        while (k > 0) {
            k--;
            prev++;
        }

        return prev;
    }
}

/*
 * Runtime
 * 1
 * ms
 * Beats
 * 29.35%
 * of users with Java
 * Memory
 * 42.32
 * MB
 * Beats
 * 37.53%
 * of users with Java
 */