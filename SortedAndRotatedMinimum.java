//www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/minimum-element-in-a-sorted-and-rotated-array3611

public class SortedAndRotatedMinimum {

    public int findMin(int[] arr) {
        
        int n = arr.length;
        
        int s = 0;
        int e = n - 1;
        
        while(s < e){
            int mid = s + (e - s) / 2;
            
            if(arr[s] < arr[e]){    //arr is sorted
                return arr[s];
            }
            else if(arr[mid] > arr[e]) { // mid ele.(19) > end (10) 
                s = mid + 1;
            }
            else{
                e = mid;
            }
        }
        
        return arr[s];
    }

}
