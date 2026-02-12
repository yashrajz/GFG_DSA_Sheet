//www.geeksforgeeks.org/batch/skill-up-dsa/track/su-dsa-topic-wise-week3/problem/intersection-of-two-arrays-with-duplicate-elements

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArraysWithDuplicates {

    public ArrayList<Integer> intersect(int[] a, int[] b) {
        
        Set<Integer> set = new HashSet<>();
        Set<Integer> res = new HashSet<>();
        
        for(int num : a){
            set.add(num);   // a ke saare elements set me. 
        }
        
        for(int num : b){
            if(set.contains(num)){  //check b ke ele. set me v hai?!
                res.add(num);       // agar hai to res me add.
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>(res);
        
        return result;
    }
}
