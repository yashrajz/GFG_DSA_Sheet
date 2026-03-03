

import java.util.Arrays;

public class MaxNumberOfOverlappingIntervals {
    
    public static int overlapInt(int[][] arr) {
        int n = arr.length;
        
        int[] start = new int[n];
        int[] end = new int[n];
        
        // Separating start and end times
        for (int i = 0; i < n; i++) {
            start[i] = arr[i][0];
            end[i] = arr[i][1];
        }
        
        // Sorting both arrays;
        Arrays.sort(start);
        Arrays.sort(end);
        
        int i = 0, j = 0;
        int count = 0;
        int maxOverlap = 0;
        
        // Sweep line traversal
        while (i < n && j < n) {
            if (start[i] <= end[j]) {
                count++;
                maxOverlap = Math.max(maxOverlap, count);
                i++;
            } else {
                count--;
                j++;
            }
        }
        
        return maxOverlap;
    }
}