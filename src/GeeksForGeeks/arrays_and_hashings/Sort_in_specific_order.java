package GeeksForGeeks.arrays_and_hashings;

import java.util.Arrays;

public class Sort_in_specific_order {

    class Solution {
        public void sortIt(int[] arr) {

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0)
                    arr[i] *= -1;

            }

            Arrays.sort(arr);

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] < 0)
                    arr[i] = Math.abs(arr[i]);

            }

        }
    }

}
