//www.geeksforgeeks.org/batch/gfg-160-problems/track/bit-manipulation-gfg-160/problem/missing-number-in-array1416

public class MissingInArray {
    int missingNum(int arr[]) {
        
        int n = arr.length + 1;
        int xor1 = 0;   //will calculate actual xor of number from 1 - n
        int xor2 = 0;   //will calculate xor of number present in arr
        
        for(int i = 1; i <= n; i++){
            xor1 ^= i;
        }
        
        for(int num : arr){
            xor2 ^= num;
        }
        
        return xor1 ^ xor2;
    }
}
