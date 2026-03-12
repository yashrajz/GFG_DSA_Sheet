//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week6/problem/ternary-search

public class TernarySearch {

    public int findMinIndex(int[] arr) {
        
        int n = arr.length;
        
        int s = 0;
        int e = n - 1;
        int minIdx = -1;
        
        while(s < e){
            
            int mid1 = s + (e - s) / 3;
            int mid2 = e - (e - s) / 3;
            
            if(arr[mid1] == arr[mid2]){
                
                s = mid1 + 1;
                e = mid2 - 1;
                
                minIdx = mid1;
            }
            else if(arr[mid1] < arr[mid2]){
                e = mid2 - 1;   //min lies in left;
                minIdx = mid1;
                
            }
            else{
                s = mid1 + 1;
                minIdx = mid2;
            }
            
        }
        return minIdx;
    }

}
