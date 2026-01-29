//www.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1


import java.util.LinkedList;
import java.util.Queue;

public class StreamFirstNonRepeating {
    public String firstNonRepeating(String s) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();  // maintains order of characters seen so far
        StringBuilder result = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            // Step 1: update frequency
            freq[ch - 'a']++;
            
            // Step 2: add current character to queue
            q.add(ch);
            
            // Step 3: remove characters from front of queue that are repeating
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.poll();
            }
            
            // Step 4: decide what to append to result
            if (q.isEmpty()) {
                result.append('#');
            } else {
                result.append(q.peek());
            }
        }
        
        return result.toString();
    }
}
