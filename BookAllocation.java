public class BookAllocation {
    public int findPages(int[] arr, int n, int m) {
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        
        int s = 0, e = sum;
        while(s < e){
            int mid = s + (e - s) / 2;
            if(isPossible(arr, n, m, mid)){
                e = mid;
            }
            else{
                s = mid + 1;
            }
        }
        
        return s;
    }
    
    private boolean isPossible(int[] arr, int n, int m, int mid){
        int studentsRequired = 1;
        int currentSum = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] > mid){
                return false; // A single book has more pages than mid
            }
            
            if(currentSum + arr[i] > mid){
                studentsRequired++;
                currentSum = arr[i];
                
                if(studentsRequired > m){
                    return false; // More students required than available
                }
            }
            else{
                currentSum += arr[i];
            }
        }
        
        return true; // All books can be allocated within mid pages
    }
}
