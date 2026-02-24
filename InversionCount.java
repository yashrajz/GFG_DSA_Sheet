import java.util.Arrays;

public class InversionCount {
    
    public static int countInversion(int[] arr) {
        return mergeSort(arr);
    }
    
    
    // Merge sort and count inversions
    private static int mergeSort(int[] arr) {
        if (arr.length <= 1) return 0;

        int count = 0;
        int mid = arr.length / 2;
        
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        
        count += mergeSort(left);
        count += mergeSort(right);
        count += merge(arr, left, right);
        
        return count;
    }

    // Merge two halves and count split inversions
    private static int merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int count = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                count += (left.length - i);
                arr[k++] = right[j++];
            }
        }

        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];

        return count;
    }


    public static void main(String[] args) {
        int[] arr1 = {2, 4, 1, 3, 5};
        System.out.println("Inversions: " + countInversion(arr1)); 

        int[] arr2 = {2, 3, 4, 5, 6};
        System.out.println("Inversions: " + countInversion(arr2));

        int[] arr3 = {10, 10, 10};
        System.out.println("Inversions: " + countInversion(arr3));
    }
}
