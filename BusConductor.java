//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week5/problem/bus-conductor--170647

import java.util.Arrays;

public class BusConductor {

    public int findMoves(int[] chairs, int[] passengers) {
        
        Arrays.sort(chairs);
        Arrays.sort(passengers);
        
        int n = chairs.length;
        int ans = 0;
        
        for(int i = 0; i < n; i++){
            ans += Math.abs((chairs[i] - passengers[i]));
        }
        
        return ans;
    }

}
