import java.util.*;
public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //can be solved in 3 steps;
        
        // step1: create stack to store ele. of nums2 and HashMap to store 
        // next greater elements;

        // Map stores: { num → its next greater element in nums2 }
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Stack holds num waiting for their next greater element
        Stack<Integer> st = new Stack<>();

        // step2: store next greater ele of each ele of nums2 into hm;
        for(int num : nums2){
            
            // Current num is greater than stack top?
            // → stack top found its answer!
            while(!st.isEmpty() && num > st.peek()){
                hm.put(st.pop(), num);
            }
            
            // else, push the smaller num - waiting for its own next greater;
            st.push(num);
        }
        
        // if there are ele in stack -> no greater ele for those ele of stack
        while(!st.isEmpty()){
            hm.put(st.pop(), -1);
        }

        // step3: Now form the resultant array of next greater ele
        int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            res[i] = hm.get(nums1[i]);
        }

        return res;

    }

}
