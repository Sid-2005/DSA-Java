package GeeksForGeeks.two_pointers;

public class Rotate_Array {

    class Solution {
        public void rotateArr(int arr[], int d) {


            if (d > arr.length - 1)
                d = d % (arr.length);

            rotate(arr, 0, d - 1);
            rotate(arr, d, arr.length - 1);
            rotate(arr, 0, arr.length - 1);
        }

        public static void rotate(int[] arr, int start, int end) {
            int n = end - start + 1;


            for (int i = 0; i < n / 2; i++) {

                int temp = arr[start + i];
                arr[start + i] = arr[end - i];
                arr[end - i] = temp;
            }

        }
    }

}
