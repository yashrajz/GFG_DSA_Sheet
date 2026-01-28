//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week2/problem/find-the-smallest-and-second-smallest-element-in-an-array3226

import java.util.ArrayList;

public class FirstAndSecondSmallest {

    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        
        int n = arr.length;
        
        if (n < 2) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(-1);
            return result;
        }
        
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                smin = min;
                min = arr[i];
            }
            else if (arr[i] < smin && arr[i] != min) {
                smin = arr[i];
            }
        }
        if (smin == Integer.MAX_VALUE) {
            ArrayList<Integer> result = new ArrayList<>();
            result.add(-1);
            return result;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(smin);
        return result;
        
    }
}
