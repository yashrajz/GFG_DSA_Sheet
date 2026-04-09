//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week6/problem/missing-number-in-sorted-array-of-natural-numbers

public class MissingNumber {
    int missingNumber(int arr[]) {
        int n = arr.length;
        // int aSum = n * (n - 1)/ 2;
        // asum - cSum = ans;
        
        //solving using B.S
        int s = 0, e = n - 1;
        
        while(s <= e){
            int mid = s + (e - s) / 2;
            
            if(arr[mid] > mid + 1){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return s + 1;
        
    }
}
