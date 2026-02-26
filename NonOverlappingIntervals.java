//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week5/problem/overlapping-intervals--170633

import java.util.ArrayList;
import java.util.Arrays;

public class NonOverlappingIntervals {

    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        
        //sorting using start point;
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        
        //to store the result;
        ArrayList<int[]> res = new ArrayList<>();
        
        
        // storing the 1st element [1, 3]
        int[] current = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            
            int[] next = arr[i];    // arr[i] = [2,4]
            
            // 3 from [1, 3] > 2 from [2, 4]
            if(current[1] >= next[0]){
                
                current[1] = Math.max(current[1], next[1]);
            }
            else{
                res.add(current);
                current = next;
            }
        }
        
        res.add(current);
        
        return res;
    }
}
