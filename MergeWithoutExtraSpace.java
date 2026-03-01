//www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/merge-two-sorted-arrays-1587115620

import java.util.Arrays;

public class MergeWithoutExtraSpace {
    public void mergeArrays(int a[], int b[]) {
        
        int i = a.length - 1; //ptr to last idx of a
        int j = 0;      //ptr to 0th idx of 'b'
        
        while(i >= 0 && j < b.length){
            if(a[i] < b[j]){
                i--;
            }
            else{
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                
                i--;
                j++;
            }
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
