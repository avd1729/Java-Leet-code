/* 
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
*/
// Selection sort

class Solution {
    public int majorityElement(int[] nums) {
        sort(nums);
        return nums[nums.length / 2];
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int max = getMaxIndex(arr, 0, last);
            swap(arr, last, max);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/*
 * Runtime
 * 2247
 * ms
 * Beats
 * 5.03%
 * of users with Java
 * Memory
 * 51.04
 * MB
 * Beats
 * 5.69%
 * of users with Java
 */