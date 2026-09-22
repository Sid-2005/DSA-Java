/**
 * Problem: 442. Find All Duplicates in an Array
 * Approach: In-Place Marking (Value as Index)
 * Time Complexity: O(N) - We iterate through the array exactly once.
 * Space Complexity: O(1) - We modify the input array in-place using negative signs as flags, requiring zero extra auxiliary memory.
 */

package LeetCode.arrays_and_hashings;

import java.util.ArrayList;

class Solution_442 {
    public ArrayList<Integer> findDuplicates(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < arr.length ; i++)
        {
            int p = Math.abs(arr[i]) - 1;

            if( arr[p] > 0 )
                arr[p] = arr[p] * -1;

            else
                {
                    list.add(Math.abs(arr[i]));
                }

        }
        return list;
    }
}