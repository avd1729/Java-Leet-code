/* 
You are given an integer array nums and an integer target.

You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.

For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
Return the number of different expressions that you can build, which evaluates to target.

 

Example 1:

Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3
Example 2:

Input: nums = [1], target = 1
Output: 1
 

Constraints:

1 <= nums.length <= 20
0 <= nums[i] <= 1000
0 <= sum(nums[i]) <= 1000
-1000 <= target <= 1000
*/

class Solution {

    public int findTargetSumWays(int[] nums, int target) {

        return helper(nums, 0, target, 0);
    }

    private int helper(int[] nums, int ans, int target, int index) {
        if (index == nums.length && ans != target)
            return 0;
        if (index == nums.length && ans == target) {
            return 1;
        }
        int left = helper(nums, ans + nums[index], target, index + 1);
        int right = helper(nums, ans - nums[index], target, index + 1);
        return left + right;

    }
}

/*
 * Runtime
 * 728
 * ms
 * Beats
 * 5.07%
 * of users with Java
 * Memory
 * 41.02
 * MB
 * Beats
 * 75.44%
 * of users with Java
 */