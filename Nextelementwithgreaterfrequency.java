//www.geeksforgeeks.org/problems/next-element-with-greater-frequency--170637/1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Nextelementwithgreaterfrequency {

    public ArrayList<Integer> nextFreqGreater(int[] arr) {
        
        int n = arr.length;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int[] res = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && freq.get(arr[i]) >
                                freq.get(arr[st.peek()])) {
                res[st.pop()] = arr[i];
            }
            st.push(i);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int x : res) {
            result.add(x);
        }
        return result;
    }
    
}
