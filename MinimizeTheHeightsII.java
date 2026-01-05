//www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/minimize-the-heights3351

import java.util.Arrays;

public class MinimizeTheHeightsII {
    public int getMinDiff(int[] arr, int k) {
        
        int n = arr.length;
         
        Arrays.sort(arr);       // Step 1: Sort the array

        // Step 2: Initialize the answer [initial max - initial min]
        int ans = arr[n - 1] - arr[0];

        // Step 3: Iterate through the array to find the optimal solution.
        for (int i = 1; i < n; i++) {
            // After subtracting 'k' from any height, if it
            // become negative which isn't valid, so we skip it.
            if (arr[i] - k < 0) {
                continue;
            }

            // Step 4: Calculate the new min and max heights.
            // The new min height will be the smaller of:
            // a) The original shortest tower (arr[0]) after adding 'k'.
            // b) The current tower (arr[i]) after subtracting 'k'.
            int min_height = Math.min(arr[0] + k, arr[i] - k);
            
            // The new max height will be the larger of:
            // a) The previous tower (arr[i-1]) after adding 'k'.
            // b) The original tallest tower (arr[n-1]) after subtracting 'k'.
            int max_height = Math.max(arr[i-1] + k, arr[n-1] - k);
            
            // Step 5: Update the answer.
            // compare current best answer with the difference
            // between the new max and min heights.
            ans = Math.min(ans, max_height - min_height);
        }
        
        return ans;
    }
}
