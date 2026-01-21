//www.geeksforgeeks.org/problems/remove-k-digits/1

import java.util.Stack;

public class RemoveKDigits {
    public String removeKdig(String s, int k) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            // Remove larger digits when possible
            while (!st.isEmpty() && k > 0 && st.peek() > c) {
                st.pop();
                k -= 1;
            }

            if (!st.isEmpty() || c != '0')
                st.push(c);
        }

        // Remove remaining digits if any
        while (!st.isEmpty() && k-- > 0)
            st.pop();

        if (st.isEmpty())
            return "0";

        // Build result from stack
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
        }
        return result.reverse().toString();
        
    }
}
