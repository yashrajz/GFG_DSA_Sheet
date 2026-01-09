//www.geeksforgeeks.org/batch/gfg-160-problems/track/bit-manipulation-gfg-160/problem/finding-the-numbers0215

public class UniqueNumberII {
    public int[] singleNum(int[] arr) {
        
        int xor = 0;
        for(int num : arr){
            xor ^= num;
        }
        
        int mask = xor & -xor;
        
        int first = 0;
        int second = 0;
        
        for(int num : arr){
            if((num & mask) != 0){
                first ^= num;
            }
            else{
                second ^= num;
            }
        }
        
        int[] res = new int[2];
        
        if(first < second){
            res[0] = first; 
            res[1] = second; 
        }
        else{
            res[0] = second;
            res[1] = first; 
        }
        
        return res;
    }
}
