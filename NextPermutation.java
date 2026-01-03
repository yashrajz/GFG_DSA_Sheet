//www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/next-permutation5226

public class NextPermutation {
    void nextPermutation(int[] arr) {
        
        int pivot = -1;
        int n = arr.length;
        
        //finding pivot element;
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] < arr[i + 1]){
                pivot = i;
                break;
            }
        }
        
        //if pivot not found;
        if(pivot == -1){
            reverse(arr, 0, n - 1);
            return;
        }
        
        //if pivot found,
        // check ele. greater than pivot ele. from right
        for(int i = n - 1; i > pivot; i--){
            if(arr[i] > arr[pivot]){
                swap(arr, pivot, i);
                break;
            }
        }
        
        reverse(arr, pivot + 1, n - 1);
        
        
    }
    
    static void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    
    static void reverse(int[] arr, int s, int e){
        while(s < e){
            swap(arr, s, e);
            s++;
            e--;
        }
    }
}
