//www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array

public class ReverseanArray {
    public void reverseArray(int arr[]) {
        
        int s = 0;
        int e = arr.length - 1;
        
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            
            s++;
            e--;
        }
    }
}
