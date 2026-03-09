//www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/search-in-a-rotated-array4618

public class SearchInRotatedSortedArray {

    int search(int[] arr, int key) {
        
        int n = arr.length;
        
        int s = 0;
        int e = n - 1;
        
        while(s <= e){
            
            int mid = s + (e - s) / 2;
            
            if(arr[mid] == key){
                return mid;
            }
            
            if(arr[s] <= arr[mid]){  // s ---> mid is sorted
                if(arr[s] <= key && key < arr[mid]){ //key is b/w s -> m
                    e = mid - 1;
                }
                else{
                    s = mid + 1;
                }
            }
            else{                   //mid ---> e is sorted
                if(arr[mid] < key && key <= arr[e]){
                    s = mid + 1;
                }
                else{
                    e = mid - 1;
                }
            }
        }
        
        return -1;
    }
}
