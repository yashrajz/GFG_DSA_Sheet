//www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/smallest-positive-missing-number-1587115621

public class SmallestPositiveMissing {
    public int missingNumber(int[] arr) {
        
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
        
            while(arr[i] >= 1 && arr[i] <= n && 
                  arr[i] != arr[arr[i] - 1]){
                      
                int idx = arr[i] - 1;   //correct pos of element
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
            
        }
        
        for(int i = 0; i < n; i++){
            if(arr[i] != i + 1){    //inde 0 = 1, index 1 = 2 ...
                return (i + 1);
            }
        }
        
        return n + 1;
    }
}
