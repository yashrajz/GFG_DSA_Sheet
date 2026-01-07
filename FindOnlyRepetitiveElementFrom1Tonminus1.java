//www.geeksforgeeks.org/batch/gfg-160-problems/track/bit-manipulation-gfg-160/problem/find-repetitive-element-from-1-to-n-1

public class FindOnlyRepetitiveElementFrom1Tonminus1 {
    public int findDuplicate(int[] arr) {
        int n = arr.length;
        
        int ans = 0;
        for(int i = 0; i < arr.length - 1; i++){
            ans = ans ^ (i+1) ^ arr[i];
        }
        
        return ans ^ arr[n - 1];
    }
}
