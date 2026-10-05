/**
 * Problem: 88. Merge Sorted Array
 * Approach: Backwards Three Pointers
 * Time Complexity: O(M + N) - We iterate through both arrays at most once.
 * Space Complexity: O(1) - All modifications are done in-place within nums1.
 */

package LeetCode.two_pointers;

class Solution_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
