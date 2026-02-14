//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week3/problem/longest-span-with-same-sum-in-two-binary-arrays5142

import java.util.HashMap;

public class LongestSpanWithSameSumInTwoBinaryArrays {

    public int equalSumSpan(int[] a1, int[] a2) {
        HashMap<Integer, Integer> res = new HashMap<>();
        
        int diff = 0;
        int maxLen = 0;
        
        res.put(0, -1);
        
        for(int i = 0; i < a1.length; i++){
            diff = diff + (a1[i] - a2[i]);
            
            if(res.containsKey(diff)){
                int prevIdx = res.get(diff);
                int len = i - prevIdx;
                
                maxLen = Math.max(maxLen, len);
            }
            else{
                res.put(diff, i);
            }
        }
        
        return maxLen;
    }
}
