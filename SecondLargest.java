// www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735
public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        
        int max = -1;
        int smax = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i] > smax && arr[i] != max){
                smax = arr[i];
            }
            
        }
        
        return smax;
    }
}