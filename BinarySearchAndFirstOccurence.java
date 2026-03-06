//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week6/problem/binary-search-1587115620

public class BinarySearchAndFirstOccurence {

    public int binarysearch(int[] arr, int k) {
        
        int s = 0;
        int e = arr.length - 1;
        int res = -1;
        
        while(s <= e){
            int mid = s + (e - s) / 2;
            
            if(arr[mid] == k){
                res = mid;
                e = mid - 1;
            }
            
            else if(arr[mid] > k){
                e = mid - 1;
            }
            
            else{
                s = mid + 1;
            }
        }
        
        return res;
    }

}