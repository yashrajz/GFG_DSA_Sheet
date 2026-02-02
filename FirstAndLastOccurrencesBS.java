//www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1

import java.util.ArrayList;

public class FirstAndLastOccurrencesBS {
    ArrayList<Integer> find(int arr[], int x) {
        
        int f = firstOccurence(arr, x);
        int l = lastOccurence(arr, x);
        
        ArrayList<Integer> res = new ArrayList<>();
        
        res.add(f);
        res.add(l);
        
        return res;
        
    }
    
    
    int firstOccurence(int[] arr, int target){

        int s = 0; 
        int e = arr.length - 1;
        int idx = -1;
        
        while(s <= e){
            
            int mid = s + (e - s)/2;
            
            if(arr[mid] == target){
                idx = mid;
                e = mid - 1;
            }
            else if(arr[mid] > target){
                e = mid - 1;
                
            }
            else{
                s = mid + 1;
            }
        }
        
        return idx;
        
        
    }
    
    int lastOccurence(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;
        int idx = -1;
        
        while(s <= e){
             
            int mid = s + (e - s)/2;
            
            if(arr[mid] == target){
                idx = mid;
                s = mid + 1;
            }
            else if(arr[mid] > target){
                e = mid - 1;
                
            }
            else{
                s = mid + 1;
            }
        }
        
        return idx;
     }
}
