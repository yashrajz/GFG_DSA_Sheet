//www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/rotate-array-by-n-elements-1587115621

public class RotateArray {
    static void rotateArr(int arr[], int d) {
        int n = arr.length; 
        
        d = d % n;
        
        swap(arr, 0, n - 1);
        swap(arr, 0, n - d - 1);
        swap(arr, n-d, n-1);
        
    }
    
    static void swap(int[] arr, int s, int e){
        
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            
            s++;
            e--;
        }
        
    }
}
