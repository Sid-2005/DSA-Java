package GeeksForGeeks.sliding_window;

public class Max_Sum_Subarray_of_size_K {

    class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        
        
        int max = -1;
        int left = 0;
        int right = k -1;
        int current = 0;
        
        for( int i = 0 ; i < k ; i ++)
            current = current + arr[i];
        
        max = current;
        
        left++;
        right++;
        
        while(right < arr.length)
        {
            current = current - arr[left -1] + arr[right];    
            max = Math.max(max,current);
            left++;
            right++;
            
        }
        return max;        
    }
}
    
}
