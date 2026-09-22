package GeeksForGeeks.arrays_and_hashings;
import java.util.ArrayList;

public class Duplicates_in_Limited_Range_Array {

    class Solution {
        public ArrayList<Integer> findDuplicates(int[] arr) {

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                int p = Math.abs(arr[i]) - 1;

                if (arr[p] > 0)
                    arr[p] = arr[p] * -1;

                else {
                    list.add(Math.abs(arr[i]));
                }

            }
            return list;
        }
    }
}
