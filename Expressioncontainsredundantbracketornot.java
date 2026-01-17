//www.geeksforgeeks.org/problems/expression-contains-redundant-bracket-or-not/1

import java.util.Stack;

public class Expressioncontainsredundantbracketornot {
    
    public static boolean checkRedundancy(String s) {
        Stack<Character> st = new Stack<>();
        char[] str = s.toCharArray();
        
        // Iterate through the given expression 
        for (int i=0; i<s.length(); i++) {
              char ch = str[i];
            // if current character is close parenthesis ')' 
            
            if (ch == ')') {
                char top = st.peek();
                st.pop();

                // If immediate pop has open parenthesis '(' 
                // duplicate brackets found 
                boolean flag = true;

                while (top != '(') {

                    // Check for operators in expression 
                    if (top == '+' || top == '-'
                            || top == '*' || top == '/') {
                        flag = false;
                    }

                    // Fetch top element of stack 
                    top = st.peek();
                    st.pop();
                }

                // If operators not found 
                if (flag) {
                    return true;
                }
            } else {
                st.push(ch); 
            }              
        }
        return false;
    }


}
