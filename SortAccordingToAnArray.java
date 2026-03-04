//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week5/problem/relative-sorting4323

import java.util.*;

public class SortAccordingToAnArray {

    static void relativeSort(int[] a1, int[] a2) {
        
        Map<Integer, Integer> freq = new HashMap<>();
        
        //counting freq of a1;
        for (int num : a1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        //ptr to iterate
        int idx = 0;
        
        // Placing elements in the order they appear in a2
        for (int num : a2) {
            if (freq.containsKey(num)) {
                int count = freq.get(num);
                while (count > 0) {
                    a1[idx++] = num;
                    count--;
                }
                freq.remove(num);  // All occurrences of this number are placed
            }
        }
        
        // elements not present in a2 & and sort them
        List<Integer> remaining = new ArrayList<>();
        for (var entry : freq.entrySet()) {
            int val = entry.getKey();
            int count = entry.getValue();
            while (count > 0) {
                remaining.add(val);
                count--;
            }
        }
        
        // Sorting the rem. elements
        Collections.sort(remaining);
        
        // Appending sorted element
        for (int num : remaining) {
            a1[idx++] = num;
        }
        
    }

}
