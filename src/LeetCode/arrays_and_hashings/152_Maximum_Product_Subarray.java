/**
 * Problem: 152. Maximum Product Subarray
 * Approach: Prefix & Suffix Products
 * Time Complexity: O(N) - We iterate through the array exactly once, calculating both prefix and suffix products simultaneously.
 * Space Complexity: O(1) - We only use a few integer variables (max, prefix, suffix) regardless of the input array size.
 */

package LeetCode.arrays_and_hashings;

class Solution_152 {
    public int maxProduct(int[] nums) {

        int max = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;

            prefix = prefix * nums[i];
            suffix = suffix * nums[n - 1 - i];

            max = Math.max(max, Math.max(prefix, suffix));
        }

        return max;
    }
}