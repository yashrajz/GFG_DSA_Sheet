//www.geeksforgeeks.org/batch/gfg-160-problems/track/searching-gfg-160/problem/k-th-element-of-two-sorted-array1317

public class KthElementOfTwoArrays {
    public int kthElement(int a[], int b[], int k) {
        int i = 0, j = 0, l = 0;
        int[] arr = new int[a.length + b.length];
        
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                arr[l] = a[i];
                i++;
            }
            else{
                arr[l] = b[j];
                j++;
            }
            l++;
        }
        
        while(i < a.length){
            arr[l] = a[i];
            i++;
            l++;
        }
        while(j < b.length){
            arr[l] = b[j];
            j++;
            l++;
        }
        
        return arr[k - 1];
        
        
    }

}
