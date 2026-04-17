// www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week6/problem/find-the-element-that-appears-once-in-sorted-array0624

public class SinglesInTheDoublesInASorted {

    int single(int[] arr) {
        
        //core idea = arr is sorted, the ele is in pair so 0, 1.. is same
        // element and so on.. 2, 3 is same ele. So, if single ele is there,
        // sequence change. 
        
        int s = 0;
        int e = arr.length - 1;
        
        while(s < e){
            int mid = s + (e - s)/2;
            
            if(mid % 2 == 1){
                mid--;
            }
            
            if(arr[mid] == arr[mid + 1]){
                s = mid + 2;
            }
            else{
                e = mid;
            }
        }
        
        return arr[s];
    }

}
