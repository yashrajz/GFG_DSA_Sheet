//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week2/problem/max-sum-in-the-configuration

public class MaxSumInConfiguration {
    
    int maxSum(int arr[]){
        int n = arr.length;
        
        int totalSum = 0;
        int currSum = 0;
        
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
            currSum += i * arr[i];
        }
        
        int maxSum = currSum;
        
        for (int i = 1; i < n; i++) {
            int lastElement = arr[n - i];
            int nextSum = currSum + totalSum - n * lastElement;
            
            maxSum = Math.max(maxSum, nextSum);
            currSum = nextSum;
        }
        
        return maxSum;
    }
}
