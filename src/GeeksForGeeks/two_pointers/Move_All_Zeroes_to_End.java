package GeeksForGeeks.two_pointers;

public class Move_All_Zeroes_to_End {

    class Solution {
        void pushZerosToEnd(int[] arr) {

            int write = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[write];
                    arr[write] = temp;

                    write++;
                }
            }
        }
    }

}
