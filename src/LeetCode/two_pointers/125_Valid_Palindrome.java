/**
 * Problem: 125. Valid Palindrome
 * Approach: String Cleaning + Two Pointers (Loop)
 * Time Complexity: O(N) - Regex replacement and string traversal both take linear time.
 * Space Complexity: O(N) - A new cleaned string is created in memory.
 */

package LeetCode.two_pointers;

class Solution_125 {
    public boolean isPalindrome(String s) {

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for( int i = 0 ; i < cleaned.length()/2 ; i++)
            {
                if(cleaned.charAt(i) != cleaned.charAt(cleaned.length()- i - 1 )  )
                    return false;
            }

        return true;
    }
}
