import java.util.Stack;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        //for revision - https://www.youtube.com/watch?v=ysy1o-QEj3k

        int n = heights.length;
        
        int[] left = new int[n];    //left smallest nearest
        int[] right = new int[n];   //right smallest nearest
        Stack<Integer> st = new Stack<>();

        //right smaller ke liye, right array chahiye so right se iterate hoga
        for(int i = n - 1; i >= 0; i--){

            while(st.size() > 0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            right[i] = st.isEmpty() ? n : st.peek();

            st.push(i);

        }

        // emptying the stack for finding left smallest;
        while(!st.isEmpty()){
            st.pop();
        }

        //left smaller ke liye, left array chahiye so left se iterate hoga
        for(int i = 0; i < n; i++){

            while(st.size() > 0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            left[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);

        }


        int ans = 0;
        for(int i = 0; i < n; i++){
            int width = right[i] - left[i] - 1;
            int currArea = heights[i] * width;
            ans = Math.max(currArea, ans);
        }

        return ans;

    }

}
