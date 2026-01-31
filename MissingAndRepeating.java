//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week2/problem/find-missing-and-repeating2512

import java.util.*;
public class MissingAndRepeating {
    
    ArrayList<Integer> findTwoElement(int arr[]) {
        
        int n = arr.length;
        int i = 0;
        
        ArrayList<Integer> res = new ArrayList<>();
        
        //Sorting element in it's correct position;
        while(i < n){
            int correctIdx = arr[i] - 1;
            
            if(arr[i] != arr[correctIdx]){
                swap(arr, i , correctIdx);
            }
            else{
                i++;
            }
        }
        
        //checking for misssing and repeating ele'
        for(int j = 0; j < n; j++){
            if(arr[j] != j + 1){
                int missing = j + 1;
                int repeating = arr[j];
                
                res.add(repeating);
                res.add(missing);
            }
        }
        
        return res;
        
    }
    
    public static void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
