//www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/max-circular-subarray-sum-1587115620

public class MaxCircularSubarraySum {
    public int maxCircularSum(int arr[]) {
        
        int totalSum = 0;
        
        int maxSum = arr[0];
        int minSum = arr[0];
        
        int currMaxSum = 0;
        int currMinSum = 0;
        
        for(int i = 0; i < arr.length; i++){
            
            //kadanes algorith to find max subarray
            currMaxSum = Math.max(arr[i], currMaxSum + arr[i]);
            maxSum = Math.max(currMaxSum, maxSum);
            
            //kadanes algorith to find min subarray
            currMinSum = Math.min(arr[i], currMinSum + arr[i]);
            minSum = Math.min(currMinSum, minSum);
            
            totalSum += arr[i];
            
        }
        
        int normalSum = maxSum;
        int circularSum = totalSum - minSum;
        
        if(minSum == totalSum){
            return normalSum;
        }
        
        return Math.max(normalSum, circularSum);
        
    }
}
