/**
 * Problem: 3. Longest Substring Without Repeating Characters
 * Approach: Dynamic Sliding Window (HashSet)
 * Time Complexity: O(N) - In the worst case, each character is visited twice (once by right pointer, once by left).
 * Space Complexity: O(min(N, M)) - The HashSet stores at most the size of the string N, or the size of the character set M (e.g., 26 letters or 128 ASCII).
 */

package LeetCode.sliding_window;

import java.util.HashSet;
import java.util.Set;

class Solution_3 {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int max = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {

            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(s.charAt(r));

            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}
