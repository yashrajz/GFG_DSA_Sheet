//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week6/problem/search-an-element-in-an-array-1587115621

public class LinearSearch {
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; 
    }
}
