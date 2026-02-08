//www.geeksforgeeks.org/problems/rotation4723/1

public class FindKthRotation {

    public int findKRotation(int arr[]) {
        
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        
        if(arr[s] < arr[e]){
            return 0;
        }
        
        while(s < e){
            int mid = s + (e - s) / 2;
            
            if(arr[mid] > arr[e]){
                s = mid + 1;
            }
            else{
                e = mid;
            }
        }
        
        return s;
    }
    
}
