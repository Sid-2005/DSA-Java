/**
 * Problem: 14. Longest Common Prefix
 * Approach: Vertical Scanning
 * Time Complexity: O(S) - Where S is the sum of all characters in all strings. In the worst case, all strings are identical and we check every character.
 * Space Complexity: O(1) - We only use constant extra space for pointers and index tracking (excluding the space used to build the answer string).
 */

package LeetCode.strings;

class Solution_14 {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";

        String ans = "";

        int count = 0;

        while (count < strs[0].length()) {
            int check = 1;

            for (int i = 1; i < strs.length; i++) {
                if (count < strs[i].length()) {
                    if (strs[0].charAt(count) == strs[i].charAt(count))
                        check++;
                } else
                    break;
            }

            if (check == strs.length) {
                ans = ans + strs[0].charAt(count);
                count++;
            } else {
                break;
            }

        }
        return ans;

    }

}
