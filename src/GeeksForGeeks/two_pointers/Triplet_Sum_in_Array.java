package GeeksForGeeks.two_pointers;

import java.util.Arrays;

public class Triplet_Sum_in_Array {

    class Solution {
        public boolean hasTripletSum(int arr[], int target) {

            Arrays.sort(arr);

            for (int i = 0; i < arr.length; i++) {
                int left = i + 1;
                int right = arr.length - 1;
                int sum = 0;
                while (left < right) {
                    sum = arr[i] + arr[left] + arr[right];

                    if (sum == target)
                        return true;

                    else if (sum < target)
                        left++;
                    else
                        right--;

                }


            }
            return false;
        }
    }

}
