// www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/kadanes-algorithm-1587115620

public class KadanesAlgorithm {
    int maxSubarraySum(int[] arr) {
        
        int n = arr.length;
        
        int currSum = arr[0];
        int maxSum = arr[0];
        
        if(n == 0){
            return 0;
        }
        for(int i = 1; i < n; i++){
            currSum = Math.max(arr[i], arr[i] + currSum);
            maxSum = Math.max(currSum, maxSum);
        }
        
        return maxSum;
    }
}
