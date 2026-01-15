//www.geeksforgeeks.org/problems/candy/1

import java.util.*;
public class Candy {
    public int minCandy(int arr[]) {
        
        int n = arr.length;

        int[] leftCandy = new int[n];
        int[] rightCandy = new int[n];
        Arrays.fill(leftCandy, 1);
        Arrays.fill(rightCandy, 1);

        // Left pass
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1])
                leftCandy[i] = leftCandy[i - 1] + 1;
        }

        // Right pass
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1])
                rightCandy[i] = rightCandy[i + 1] + 1;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            
            // Take max at each position
            ans += Math.max(leftCandy[i], rightCandy[i]);
        }

        return ans;
    }
}
