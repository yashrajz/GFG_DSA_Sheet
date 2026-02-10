//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week3/problem/most-frequent-element-in-an-array

import java.util.HashMap;

public class MostFrequentElementInAnArray {

    public int mostFreqEle(int[] arr) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        //mapping/counting frequency;
        for(int num : arr){
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        //counting height one;
        int res = -1; 
        int maxCount = 0 , count = 0;
        
        for(var entry : hm.entrySet()){
            int num = entry.getKey();
            count = entry.getValue();
            
            if(count > maxCount || (count == maxCount && num > res)){
                maxCount = count;
                res = num;
            }
        }
        
        return res;
        
        
    }
}
