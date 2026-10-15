/**
 * Problem: 49. Group Anagrams
 * Approach: HashMap with Character Frequency String Key
 * Time Complexity: O(N * K) - Where N is the number of strings and K is the max length of a string. We count characters in linear time.
 * Space Complexity: O(N * K) - The HashMap stores all strings and their corresponding frequency string keys.
 */

package LeetCode.arrays_and_hashings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution_49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> frequencyStringsMap = new HashMap<>();

        for (String str : strs) {

            String freqString = getFrequency(str);

            if (frequencyStringsMap.containsKey(freqString)) {
                frequencyStringsMap.get(freqString).add(str);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(str);

                frequencyStringsMap.put(freqString, strList);
            }
        }

        return new ArrayList<>(frequencyStringsMap.values());
    }

    public static String getFrequency(String s) {

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        char start = 'a';
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            str.append(start);
            str.append(freq[i]);
            start++;
        }

        return str.toString();
    }
}
