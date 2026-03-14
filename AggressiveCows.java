//www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/aggressive-cows

import java.util.*;

public class AggressiveCows {
    public boolean isPossible(int[] stalls, int cows, int mid){
        int count = 1;
        int lastPos = stalls[0];
        
        for(int i = 1; i < stalls.length; i++){
            if(stalls[i] - lastPos >= mid){
                count++;
                lastPos = stalls[i];
            }
            if(count >= cows){
                return true;
            }
        }
        return false;
    }
    
    public int aggressiveCows(int[] stalls, int cows) {
        Arrays.sort(stalls);
        
        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(isPossible(stalls, cows, mid)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
}
