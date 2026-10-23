// 2.Valid Parentheses  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid. An input string is valid if: 
// 1. Open brackets must be closed by the same type of brackets. 
// 2. Open brackets must be closed in the correct order. 3. Every close bracket has a corresponding open bracket of the same type. 
// Example 1: Input: s = "()" Output: true 
// Example 2: Input: s = "()[]{}" Output: true 
// Example 3: Input: s = "(]" Output: false 
// Example 4: Input: s = "([])" Output: true 
// Example 5: Input: s = "([)]" Output: false 
// Constraints: • 1 <= s.length <= 104 • s consists of parentheses only '()[]{}'. 

import java.util.*;

public class ValidParenthethis {
    public static boolean validparenthesis(String s) {
        
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } 
            else{
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }

        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean isValid = validparenthesis(str);
        System.out.println(isValid);

        sc.close();
    }
}
