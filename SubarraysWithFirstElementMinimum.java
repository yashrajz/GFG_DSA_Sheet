import java.util.Stack;

public class SubarraysWithFirstElementMinimum {
    public int countSubarrays(int[] arr) {
        
    Stack<Integer> st = new Stack<Integer>();
    int ans = 0;
    int n = arr.length;

    for (int i = n - 1; i >= 0; i--) {
      while (st.empty() == false
             && arr[st.peek()] >= arr[i])
        st.pop();
        
      // The index of next smaller element
      // starting from i'th index
      int last = ((st.empty() == true) ? n : st.peek());

      // Adding the number of subarray which
      // can be formed in the range [i, last]
      ans += (last - i);
      st.push(i);
    }
    return ans;
    }    
}
