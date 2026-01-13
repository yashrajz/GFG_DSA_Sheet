//www.geeksforgeeks.org/problems/max-xor-subarray-of-size-k/1

public class MaxXorSubarrayOfsizeK {
    public int maxSubarrayXOR(int[] arr, int k) {
        
        int currXor = 0;
        
        for(int i = 0; i < k; i++){
            currXor = currXor ^ arr[i];
        }
        
        int maxXor = currXor;
        
        for(int i = k; i < arr.length; i++){
            
            currXor = currXor ^ arr[i - k]; //removing left element
            currXor = currXor ^ arr[i];     //adding right element
            
            maxXor = Math.max(currXor, maxXor);
        }
        
        return maxXor;
        
    }
}
