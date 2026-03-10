public class PeakElement {

    public int peakElement(int[] arr) {
        
        int n = arr.length;
        
        //for 1 ele.
        if(n == 1){
            return 0;
        }
        
        //if 1st ele. is peak
        if(arr[0] > arr[1]){
            return 0;
        }
        
        //if last ele. is peak;
        if(arr[n - 1] > arr[n - 2]){
            return n - 1;
        }
        
        //for 1 --> n - 2;
        int s = 1;
        int e = n - 2;
        
        while(s <= e){
            int mid = s + (e - s) / 2;
            
            if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                return mid;
            }
            
            if(arr[mid] < arr[mid + 1]){ //increasing ord. 
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return 0;
    }

}
