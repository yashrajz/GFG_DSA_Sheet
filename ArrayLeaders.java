//www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&category=Arrays&sortBy=submissions

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    static ArrayList<Integer> leaders(int arr[]) {
        
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        int maxRight = arr[n - 1];
        result.add(maxRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                result.add(maxRight);
            }
        }
        
        Collections.reverse(result);

        return result;
    }
}
