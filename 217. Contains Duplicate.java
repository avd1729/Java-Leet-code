/* 
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
*/

// Time complexity: O(n)
// Space complexity: O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a hashset...
        HashSet<Integer> hset = new HashSet<Integer>();
        // Traverse all the elements through the loop...
        for (int idx = 0; idx < nums.length; idx++) {
            // Searches hashset. if present, it contains duplicate...
            if (hset.contains(nums[idx])) {
                return true;
            }
            // if not present it will update hashset...
            hset.add(nums[idx]);
        }
        // Otherwise return false...
        return false;
    }
}

/*
 * Runtime
 * 11
 * ms
 * Beats
 * 62.45%
 * of users with Java
 * Memory
 * 58.58
 * MB
 * Beats
 * 12.59%
 * of users with Java
 */
