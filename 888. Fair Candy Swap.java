/*
Alice and Bob have a different total number of candies. You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.

Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.

Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, and answer[1] is the number of candies in the box that Bob must exchange. If there are multiple answers, you may return any one of them. It is guaranteed that at least one answer exists.

 

Example 1:

Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]
Example 2:

Input: aliceSizes = [1,2], bobSizes = [2,3]
Output: [1,2]
Example 3:

Input: aliceSizes = [2], bobSizes = [1,3]
Output: [2,3]
 

Constraints:

1 <= aliceSizes.length, bobSizes.length <= 104
1 <= aliceSizes[i], bobSizes[j] <= 105
Alice and Bob have a different total number of candies.
There will be at least one valid answer for the given input.
*/

import java.util.HashSet;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        for (int i : aliceSizes) {
            aliceSum += i;
        }

        int bobSum = 0;
        HashSet<Integer> bobSet = new HashSet<>();
        // Calculate sum of elements in Bob's array and create a HashSet for easy lookup
        for (int i : bobSizes) {
            bobSum += i;
            bobSet.add(i);
        }

        // Calculate the difference between the sums of Alice's and Bob's arrays
        int targetDiff = (aliceSum - bobSum) / 2;

        // Search for a pair (a, b) such that a - b equals the target difference
        for (int a : aliceSizes) {
            int b = a - targetDiff;
            if (bobSet.contains(b)) {
                // If found, return the pair (a, b)
                return new int[] { a, b };
            }
        }

        // If no such pair is found, return an empty array
        return new int[0];
    }
}

/*
 * Runtime
 * 8
 * ms
 * Beats
 * 91.83%
 * of users with Java
 * Memory
 * 46.41
 * MB
 * Beats
 * 6.00%
 * of users with Java
 */