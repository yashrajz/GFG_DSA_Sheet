//www.geeksforgeeks.org/batch/gfg-160-problems/track/bit-manipulation-gfg-160/problem/find-unique-number

public class UniqueNumberI {
    public int findUnique(int[] arr) {
        
        int res = 0;
        for(int num : arr){
            res ^= num;
        }
        
        return res;
    }
}
