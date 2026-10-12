/**
 * Problem: 53. Maximum Subarray
 * Approach: Kadane's Algorithm
 * Time Complexity: O(N) - Single pass through the array.
 * Space Complexity: O(1) - Only two integer variables used for tracking.
 */

package LeetCode.arrays_and_hashings;
class Solution_53 {
    public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            max = Math.max(max, currSum);

            if (currSum < 0)
                currSum = 0;
        }
        return max;
    }
}

