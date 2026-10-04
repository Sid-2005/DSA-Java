package GeeksForGeeks.sliding_window;

import java.util.ArrayList;
import java.util.HashMap;

public class Count_Distinct_Elements_in_Every_Window {

    class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
     
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int left = 0 ; 
        int right = k - 1 ; 
        
        for(int i  = 0 ; i < k ; i ++)
        {
            if(map.containsKey(arr[i]))
                map.put(arr[i] , map.get(arr[i])+1 );
            else
                map.put(arr[i], 1 );
            
        }
        
        
        list.add( map.keySet().size());
        
        left++;
        right++;
        
        while(right < arr.length)
        {
            map.put(arr[left - 1] , map.get(arr[left - 1]) - 1 ) ;
            
            if(map.get(arr[left - 1]) == 0)
                map.remove(arr[left - 1]);
            
            
            if(map.containsKey(arr[right]))
                map.put(arr[right] , map.get(arr[right])+1 );
            else
                map.put(arr[right], 1 );
            
            list.add( map.keySet().size() );
            
            left++;
            right++;
        }
        
        
        
        return list;
    }
}
    
    
}
