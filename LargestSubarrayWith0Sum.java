//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week3/problem/largest-subarray-with-0-sum

import java.util.HashMap;

public class LargestSubarrayWith0Sum {
    int maxLength(int arr[]) {
        
        //core idea - check if the sum appear twic - if yes then, 
        //then that subaary, sums to 0; 
        int n = arr.length;
        HashMap<Integer, Integer> res = new HashMap<>();
        
        res.put(0, -1);   //To include start point of subarray 0
        
        int maxLen = 0;
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            sum += arr[i];              //add curr ele. to sum;
            
            if(res.containsKey(sum)){   //sum is in hashmap? - YES
                
                int prevIdx = res.get(sum);  //idx of sum in hashmap?!
                int len = i - prevIdx;      //length of subarray;
                
                maxLen = Math.max(maxLen, len);
            }
            else{                   //sumis not in hashmap;
                res.put(sum, i);    //store it in hashmap;
            }
        }
        
        return maxLen;
    }
}
