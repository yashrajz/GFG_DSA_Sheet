//www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {
    
    public ArrayList<Integer> calculateSpan(int[] arr) {

        int n = arr.length;
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            
            if (st.isEmpty()) {
                span.add(i + 1);
            }
            else {
                span.add(i - st.peek());
            }

            st.push(i);
        }

        return span;
    }
}
