/**
 * Problem: 443. String Compression
 * Approach: Reader/Writer Two Pointers
 * Time Complexity: O(N) - We iterate through the character array exactly once.
 * Space Complexity: O(1) - Modifications are done in-place, auxiliary string for count is minimal.
 */

package LeetCode.two_pointers;

class Solution_443 {
    public int compress(char[] chars) {

        int i = 0;
        int j = 0;
        int write = 0;

        while (j < chars.length) {

            while (j < chars.length && chars[i] == chars[j]) {
                j++;
            }
            int count = j - i;
            chars[write] = chars[i];
            write++;
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[write] = c;
                    write++;
                }
            }
            i = j;

        }
        return write;
    }
}
